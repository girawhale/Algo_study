### BOJ 1654. 랜선 자르기
> (https://www.acmicpc.net/problem/1654)


#### :whale: girawhale
![image](https://user-images.githubusercontent.com/48428699/91386621-606ca180-e86e-11ea-9c8b-694cef4429b8.png)

- 최적값을 찾는 것이 목적이다보니 이분탐색 돌면서 가장 긴 전선의 길이가 나오도록 돌림
- 정해진 수보다 많이 나오면 일단 누적하고 start를 변경
- 정해진 수보다 적게 나오면 end를 변경
