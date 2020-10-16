## 문제
> [Boj 1697. 숨바꼭질](https://www.acmicpc.net/problem/1697)


### :whale: girawhale

![image](https://user-images.githubusercontent.com/48428699/95935336-f56f2e00-0e0d-11eb-9a4b-45ae833d05e4.png)


- 메모를 통해 메모된 값보다 작을 경우 저장하며 bfs를 돌게됨
- visit 배열의 크기가 200,002로 지정, 2*K+2일 경우 런타임 에러 발생(이유 알게되면 알려주세여..)


### :octocat: Taekyung2

![image](https://user-images.githubusercontent.com/37056992/96285549-1015f280-101a-11eb-9d43-3b2e54a8be1c.png)

- K를 찾을 때 까지 빼고, 더하고, 곱하고 bfs 반복. 