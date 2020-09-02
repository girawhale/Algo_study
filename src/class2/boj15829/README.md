## 문제
> [Boj 15829. Hashing](https://www.acmicpc.net/problem/15829)


### :whale: girawhale

![image](https://user-images.githubusercontent.com/48428699/91641423-39c18d00-ea5f-11ea-906c-4a9729049070.png)

- 처음에는 pow를 직접 구현했다가 어차피 31만 제곱해서 메모형태로 변경함
- 입력받은 String을 하나씩 charAt으로 뽑으면서 pow값을 곱해주고 % MOD 한 값을 hash에 더해줌
- 처음에 계산한 hash에 MOD 안해줘서 틀렸음 
- MOD를 수시로 해주자!

---
### :octocat: Taekyung2
![image](https://user-images.githubusercontent.com/37056992/91849050-68757880-ec96-11ea-9261-4cc94bf9a5b7.png)

- .. 하라는대로 하니까 됬음 
- mod 전부 해주기 