<문제>
특정 시기 동안의 모바일 서비스 현황 자료를 바탕으로 향후 8주간의 현황을 예측하세요.
(Y3 1~8주차의 appID별 rank, UU, avgDuration, dayCounts 예측)
 
<참고사항>
예측을 위해 사용하는 툴(언어 포함) 자유
예측 방법에 대한 설명 자료도 선호하는 방법으로 기술해주세요. (ex. R-Markdown, Jupyter Notebook, Excel, docx, PPT 등)

* 주의: 다른 사람의 저작물을 참고 이상으로 활용하는 것은 불합격 사유가 됩니다.
 
<제출물>
1. 제공된 데이터셋 이후 8주간의 appID별 rank, UU, avgDuration, dayCounts 에 대한 예측치
2. 예측에 사용한 방법을 설명한 보고서 (예측 값을 구하지 못했다면 관련 내용 기술)
 
<제공 데이터 설명>
모바일 앱의 주간 서비스 현황에 대한 2년치 데이터가 제공됩니다. (과제 B와 동일한 자료입니다.)
- mobileTrendDataset.csv
 
컬럼 설명
- yearID: 연도 구분 (Y1 다음년도가 Y2)
- weekIndex: 주차 1~52주
- rank: 해당 주차의 앱 순위
- appID: 앱 구분자
- uniqueInstall: 앱 설치자 수(중복 불포함)
- UU: 주간 이용자 수
- useRate: 설치자중 이용자 비율
- totalDuration: 총 이용시간(분)
- avgDuration: 이용자당 평균 이용시간(분)
- dayCounts: 이용자의 평균 접속일수
- genreID: 장르 구분