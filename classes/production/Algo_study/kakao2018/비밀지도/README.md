### KAKAO2018. 비밀지도
https://programmers.co.kr/learn/courses/30/lessons/17681

#### :boom: 1n9yun

- 문제에서 설명한 과정은 or연산에 대한 이야기
- 입력으로 받은 두 지도에 있는 각 정수들을 그대로 or연산 하면 됨
- Integer.toBinaryString 함수 활용
- 9의 경우 1001 이지만 n==5인 경우 01001로 표시되어야 함 그래서 1<<n 만큼 or를 한번 더 해주면 101001이 됨 그래서 위치 1에서 잘라서("01001") 표시해주면 됨
- replaceAll은 생각 못했는데 다른사람들꺼 보고 바꿈 ㅋㅋ 꿀팁
