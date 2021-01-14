## 문제
> [Boj 18111. 마인크래프트](https://www.acmicpc.net/problem/18111)


### :whale: girawhale

![image](https://user-images.githubusercontent.com/48428699/91641497-c1a79700-ea5f-11ea-9046-36c71af4d071.png)

- 최대로 돌 수 있는 경우의 수가 500\*500\*256이라서 그냥 완탐을 하기로 함
- 맵에서 가장 작은 높이부터 가장 높은 높이까지 돌면서 칸을 맞춰보고
- 인벤의 수가 음수이면 pass, 양수면서 이전 답 이상이면 값을 바꿔줌
- 이전에 푼 코드가 더 빨라서 보니까 높이를 카운팅함. 그게 훨씬 좋은 방법인듯

---
### :octocat: Taekyung2

![image](https://user-images.githubusercontent.com/37056992/91849286-c7d38880-ec96-11ea-9506-87f1eff3c5ee.png)

- 256에서 0까지 모든 높이에서 값을 구해본다. 