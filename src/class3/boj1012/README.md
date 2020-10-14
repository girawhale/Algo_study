## 문제
> [Boj 1012. 유기농 배추](https://www.acmicpc.net/problem/1012)


### :octocat: Taekyung2

![image](https://user-images.githubusercontent.com/37056992/92192681-7ba86400-eea1-11ea-9aec-c9f71a4d9a9b.png)

- 인접한거 찾을 때 bfs 사용
- 배열을 돌면서 1이면 bfs진입, 인접한 1 전부 방문 처리


---


### :whale: girawhale

![image](https://user-images.githubusercontent.com/48428699/95932030-ae7d3a80-0e05-11eb-81c8-3f8c8dbd018f.png)


- map을 boolean 타입으로 생성하고, 배추가 심어져 있는 땅일 경우 true
- M*N 반복문을 돌며 true일 경우 bfs를 실행
- bfs를 돌며 해당 칸이 true일 경우 방문하고, map을 false로 바꾸어 방문처리 한다