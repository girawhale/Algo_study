## 문제
> [Boj 1003. 피보나치 함수](https://www.acmicpc.net/problem/1003)


### :octocat: Taekyung2

![image](https://user-images.githubusercontent.com/37056992/92192281-975f3a80-eea0-11ea-8395-1c999d582916.png)

- 시간 제한이 0.25초라서 dp를 안하면 시간 초과 날 것 같았음
- 0은 fibo(n - 1)만큼, 1은 fibo(n)만큼 호출됨 (규칙) 


---


### :whale: girawhale

![image](https://user-images.githubusercontent.com/48428699/95931610-948f2800-0e04-11eb-941e-301b258db21c.png)

- DP를 하고 싶었음
- 0을 세는 갯수와 1을 세는 갯수를 분리해 저장하고 fibo[n-1] + fibo[n-2]를 더하여 누적하여 계산함.