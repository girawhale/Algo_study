## 문제
> [Boj 1780. 종이의 개수](https://www.acmicpc.net/problem/1780)


### :whale: girawhale

![image](https://user-images.githubusercontent.com/48428699/95936061-ab874780-0e0f-11eb-95d7-7ec8b1d73423.png)


- 분할 정복
- 종이의 숫자가 모두 같다면 cnt[숫자]++
- 아니라면 종이를 분할 후 같은 작업을 반복

### :octocat: Taekyung2

![image](https://user-images.githubusercontent.com/37056992/96329625-e98fa000-1089-11eb-9490-294350fb67a9.png)

- N*N 종이에서 시작해서 3으로 나눠가며 범위의 값들이 다 같은지 확인을 해야겠지
- 다 같은 숫자라면 나누는 것을 멈추고 카운트, 아니면 계속 나눈다