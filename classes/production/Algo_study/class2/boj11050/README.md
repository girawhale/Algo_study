## 문제
> [Boj 11050. 이항 계수1](https://www.acmicpc.net/problem/11050)


### :whale: girawhale

![image](https://user-images.githubusercontent.com/48428699/91641323-8193e480-ea5e-11ea-81f6-fe6b0dbb64be.png)

- N과 K의 범위가 매우 작아서 메모까지는 안하고 단순 팩토리얼로 계산함

---
### :octocat: Taekyung2
![image](https://user-images.githubusercontent.com/37056992/91848780-eb4a0380-ec95-11ea-87b8-ff68a9167117.png)

- nCk = n-1Ck + n-1Ck-1
- bino(n, k) = bino(n - 1, k) + bino(n -1, k - 1)