## 문제
> [Boj 1931. 회의실배정](https://www.acmicpc.net/problem/1931)


### :whale: girawhale

![image](https://user-images.githubusercontent.com/48428699/96058517-63772c00-0ec6-11eb-8b8f-2213f8bbfae3.png)


- 회의가 일찍 끝나는 순으로 정렬하여 순서대로 뽑으면서 가능한지 체크한다.
- 만약 회의가 가능하다면 +1하고 종료시간을 변경, 아니라면 버림

### :octocat: Taekyung2

![image](https://user-images.githubusercontent.com/37056992/96330216-9a983980-108e-11eb-9f38-31405e9c54cd.png)

- 회의실은 하나이고 최대한 많은 회의를 진행해야 함
- 회의가 빨리 끝나는 순서로 정렬
- 회의가 끝났을 때 다음 회의 시작 시간보다 빨리 끝났으면 카운트

