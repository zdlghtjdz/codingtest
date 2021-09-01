<문제>
특정 게임(PC-Online RPG)에서 골드를 파밍하는 어뷰저를 판별해내는 룰 혹은 머신러닝 알고리즘을 작성하십시오.
제공된 학습용 데이터셋을 활용하여 모델을 만들고 테스트용 데이터셋에 적용한 결과와 모델 구현 내용을 정리해서 제출하세요.
 
<참고사항>
선호하는 언어로 분석 및 모델링하세요.
탐색적 데이터분석(EDA)과 모델링을 진행한 과정을 선호하는 방법으로 기술해주세요. (ex. Jupyter Notebook, docx, PPT 등)

* 주의: 다른 사람의 저작물을 참고 이상으로 활용하는 것은 불합격 사유가 됩니다.
 
<제출물>
1. 과제 문서 : 데이터 분석 및 모델링, 결과물에 대한 문서 (ex. Jupyter Notebook, docx, PPT 등)
2. 테스트셋 판별 결과 : 2개 컬럼(newID, res)을 가지는 csv 파일
    총 4475 유저에 대한 판별(0: 비제재, 1: 제재) 결과를 아래 양식으로 작성
    ex)
    newID, res
    1, 0
    2, 1
    3, 0
    ..., ...
 
<제공 데이터 설명>
아래 2개의 csv파일이 제공됩니다.
- 학습용 데이터셋 : abusingDetectionTrainDataset.csv
- 테스트용 데이터셋 : abusingDetectionTestDataset.csv
 
컬럼 설명
- newID: 캐릭터 식별자
- char_jobcode: 직업 식별자
- char_level: 캐릭터의 레벨
- logging_timestamp: 해당 스냅샷 로그가 찍힌 시점
- charStatA ~ G: 캐릭터의 성향정보로, 스냅샷 시점에 관계없이 계속 갱신됨 (예: 캐릭터의 매력도)
- socialAmount: 타 캐릭터와의 인터랙션 정보로 그 양을 의미함 (예: 등록된 친구 수)
- socialBooleanA ~ B: 타 캐릭터와의 인터랙션 정보로, 그 여부를 의미함(0 또는 1) (예: 길드 가입 여부)
- socialSessionAmountA ~ B: 타 캐릭터와의 인터랙션 정보 중 스냅샷 세션 내 발생한 양을 의미함 (예: 세션 중 발생시킨 채팅 횟수)
- activityCumulativeAmountA ~ B: 캐릭터의 액션 정보로서 생성시점부터 누적되는 값 (예: 누적 이벤트X 발생횟수)
- accountMetaAmountA: 캐릭터가 속한 메타 정보로서 세션에 관계없이 갱신됨 (예: 캐릭터가 소속된 계정상의 정보)
- charSessionAmountA ~ C: 캐릭터의 메타정보로서 세션동안 발생시킨 양 (예: 세션 중 특정맵A 방문 횟수)
- actionSessionAmountA ~ N: 캐릭터가 세션 중 발생시킨 액션의 양 (예: 세션 중 사냥 횟수)
- tradeSessionAmountA ~ E: 캐릭터가 세션 중 발생시킨 거래의 양 (예: 세션 중 개인간 거래 횟수)
- blocked: 미래의 제재여부 (0: 비제재 / 1: 제재) (데이터셋상 제재시점은 주어지지 않았습니다)