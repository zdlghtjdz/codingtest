import requests, bs4
import pandas as pd
import numpy as np
from urllib.parse import urlencode, quote_plus, unquote

url = "http://openapi.molit.go.kr/OpenAPI_ToolInstallPackage/service/rest/RTMSOBJSvc/getRTMSDataSvcAptTradeDev"
my_key = unquote(
    'dYGo%2B%2F5briMNaQKopUCeHs1EXCZf5WYxfSEpSz8okhuVK%2B6mO%2F%2FNVX6tUigQWX4uf%2B%2BkjrsdZWzzlU7U13pmRg%3D%3D')
queryParams = '?' + urlencode({
    quote_plus('serviceKey'): my_key,
    quote_plus('pageNo'): 1,
    quote_plus('numOfRows'): 40,
    quote_plus('LAWD_CD'): 11110,
    quote_plus('DEAL_YMD'): 202010})
# 공공데이터 보내야 할 요청 사항.
# http://openapi.molit.go.kr/OpenAPI_ToolInstallPackage/service/rest/RTMSOBJSvc/getRTMSDataSvcAptTradeDev
# ?serviceKey=dYGo%2B%2F5briMNaQKopUCeHs1EXCZf5WYxfSEpSz8okhuVK%2B6mO%2F%2FNVX6tUigQWX4uf%2B%2BkjrsdZWzzlU7U13pmRg%3D%3D
# &pageNo=1
# &numOfRows=10
# &LAWD_CD=11110
# &DEAL_YMD=201512
response = requests.get(url + queryParams).text.encode('utf-8')
xmlobj = bs4.BeautifulSoup(response, 'lxml-xml')

# print(xmlobj)

rows = xmlobj.findAll('item')

rowList = []
nameList = []
columnList = []

rowsLen = len(rows)
for i in range(0, rowsLen):
    columns = rows[i].find_all()

    columnsLen = len(columns)
    for j in range(0, columnsLen):
        if i == 0:
            nameList.append(columns[j].name)
        eachColumn = columns[j].text
        columnList.append(eachColumn)
    rowList.append(columnList)
    columnList = []

result = pd.DataFrame(rowList, columns=nameList)
print(result)

# <item>
# <거래금액> 82,500</거래금액>
# <건축년도>2008</건축년도>
# <년>2015</년>
# <도로명>사직로8길</도로명>
# <도로명건물본번호코드>00004</도로명건물본번호코드>
# <도로명건물부번호코드>00000</도로명건물부번호코드>
# <도로명시군구코드>11110</도로명시군구코드>
# <도로명일련번호코드>03</도로명일련번호코드>
# <도로명지상지하코드>0</도로명지상지하코드>
# <도로명코드>4100135</도로명코드>
# <법정동> 사직동</법정동>
# <법정동본번코드>0009</법정동본번코드>
# <법정동부번코드>0000</법정동부번코드>
# <법정동시군구코드>11110</법정동시군구코드>
# <법정동읍면동코드>11500</법정동읍면동코드>
# <법정동지번코드>1</법정동지번코드>
# <아파트>광화문풍림스페이스본(101동~105동)</아파트>
# <월>12</월>
# <일>10</일>
# <일련번호>11110-2203</일련번호>
# <전용면적>94.51</전용면적>
# <지번>9</지번>
# <지역코드>11110</지역코드>
# <층>11</층>
# </item>

# 그래프 그리기
# 1. 층 별 거래금액 분포 그래프
import matplotlib.pyplot as plt

df1 = result
df1 = df1.astype({'층': int})

df1['거래금액2'] = df1.거래금액.str.replace(',', '').astype('int64')

df2 = df1.sort_values(by='거래금액')
# print(df2)
plt.scatter(df2.층, df2.거래금액2)
plt.xlabel('floor')
plt.ylabel('transaction amount')
plt.show()

# 2. 건축년도 별 거래금액 분포 그래프

df2 = df2.astype({'건축년도': int})
plt.scatter(df2.건축년도, df2.거래금액2)
plt.xlabel('construction year')
plt.ylabel('transaction amount')
plt.show()


# 3. 구글 맵으로 위도, 경도 변환 후 데이터 지도에 표시.
import googlemaps

gmap_key = 'AIzaSyCy4Ng6UXF1DVLtVpowH-rJHH9fca25nEU'
gmaps = googlemaps.Client(key=gmap_key)

places = result['도로명'] + " " + result['도로명건물본번호코드']
lat = []
lng = []

i = 0
for place in places:
    i = i + 1
    try:
        # print(i, place)
    # 지오코딩 API 결과값 호출하여 geo_location 변수에 저장
        geo_location = gmaps.geocode(place)[0].get('geometry')
        lat.append(geo_location['location']['lat'])
        lng.append(geo_location['location']['lng'])

    except:
        lat.append('')
        lng.append('')
        print(i)

df = pd.DataFrame({'위도': lat, '경도': lng}, index=places)
# print(df)

length = len(df)

import folium
import webbrowser

map_osm = folium.Map(location=[37.614776, 127.013337], zoom_start=12)

for i in range(0, length) :
    # print(i)
    if df['위도'][i] != '' and df['경도'][i] != '': # google에서 위도 경도 값을 얻을 수 없는 값은 제외.
        folium.Marker([df['위도'][i], df['경도'][i]], popup=df.index[i]).add_to(map_osm)

map_osm.save('map1.html') # 지도 데이터 저장. html 파일을 열면 지도에 거래 장소가 마크된 형태가 나옵니다.
webbrowser.open('map1.html', new=0, autoraise=True)

# 4. 제주와 서울의 2020년 월 30건 당 평균 거래가 barplot
# 제주시 50110
# 서울시 종로구 11110

# 함수 정의 ( 월과 LAWD_CD 값을 받아 )
def data_pd(code, year_month):
    queryParams = '?' + urlencode({
        quote_plus('serviceKey'): my_key,
        quote_plus('pageNo'): 1,
        quote_plus('numOfRows'): 30,
        quote_plus('LAWD_CD'): code,
        quote_plus('DEAL_YMD'): year_month})
    response = requests.get(url + queryParams).text.encode('utf-8')
    xmlobj = bs4.BeautifulSoup(response, 'lxml-xml')

    # print(xmlobj)

    rows = xmlobj.findAll('item')

    rowList = []
    nameList = []
    columnList = []

    rowsLen = len(rows)
    for i in range(0, rowsLen):
        columns = rows[i].find_all()

        columnsLen = len(columns)
        if columnsLen == 26:
            for j in range(0, columnsLen):
                if i == 0:
                    nameList.append(columns[j].name)
                eachColumn = columns[j].text
                columnList.append(eachColumn)
        rowList.append(columnList)
        columnList = []

    result = pd.DataFrame(rowList, columns=nameList)
    date = [year_month] * len(result)
    result['년월'] = date
    # print(date_df)
    return result


df_seoul = data_pd(11110, 202001)

for i in range(202002, 202012):
    df_seoul = pd.concat([df_seoul, data_pd(11110, i)])

df_jeju = data_pd(50110, 202001)

for i in range(202002, 202012):
    df_jeju = pd.concat([df_jeju, data_pd(50110, i)])

df_seoul = df_seoul.dropna()
df_seoul['거래금액2'] = df_seoul.거래금액.str.replace(',', '').astype('int64')
df_seoul['지역코드2'] = df_seoul.지역코드.str.replace('11110', 'red')
df_seoul = df_seoul.sort_values(by='거래금액2')

df_jeju = df_jeju.dropna()
df_jeju['거래금액2'] = df_jeju.거래금액.str.replace(',', '').astype('int64')
df_jeju['지역코드2'] = df_jeju.지역코드.str.replace('50110', 'blue')
df_jeju = df_jeju.sort_values(by='거래금액2')

df_sum = df_jeju.append(df_seoul)
df_sum = df_sum.sort_values(by='거래금액2')

print(df_sum)

plt.scatter(df_seoul.년월, df_seoul.거래금액2, c=df_seoul.지역코드2,label='seoul')
plt.scatter(df_jeju.년월, df_jeju.거래금액2, c=df_jeju.지역코드2,label='jeju')
plt.xlabel('month')
plt.ylabel('transaction amount')
plt.legend()
plt.title('2020/Month per transcation amount scatter plot')
plt.show()
# 'jeju', 'seoul'
