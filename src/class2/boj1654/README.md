### BOJ 1654. 랜선 자르기
> (https://www.acmicpc.net/problem/1654)


#### :whale: girawhale
![image](https://user-images.githubusercontent.com/48428699/91386621-606ca180-e86e-11ea-9c8b-694cef4429b8.png)

- 최적값을 찾는 것이 목적이다보니 이분탐색 돌면서 가장 긴 전선의 길이가 나오도록 돌림
- 정해진 수보다 많이 나오면 일단 누적하고 start를 변경
- 정해진 수보다 적게 나오면 end를 변경

---
#### :octocat: Taekyung2
![image](https://user-images.githubusercontent.com/37056992/91516542-ba30a280-e926-11ea-8e50-b2fc94a079a0.png)

- 전형적인 이분탐색
- low 값이 high 값보다 크거나 같을 때 까지 범위를 좁힌다 

---

#### :boom: 1n9yun
![image](https://user-images.githubusercontent.com/38209225/91537505-5ec7da00-e951-11ea-8b9b-3faeabb75b18.png)

- 이분탐색 왜케 많아
- 길이를 이분탐색 하고
- 기준은 그 길이로 만들 수 있는 랜선 개수