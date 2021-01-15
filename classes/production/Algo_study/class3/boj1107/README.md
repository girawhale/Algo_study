## 문제
> [Boj 1107. 리모컨](https://www.acmicpc.net/problem/1107)



### :octocat: Taekyung2

![image](https://user-images.githubusercontent.com/37056992/95652527-9c14af80-0b2c-11eb-9af1-85ed10086974.png)

- 고장난 버튼을 제외하고 남은 숫자들로 6자리 숫자까지 만들어 본다.(dfs)
- 만든 숫자에서 목표 숫자의 차에서 누른 번호 개수를 더하면 몇 번 눌렀는지 나옴.(최소값을 구하자)

### :whale: girawhale

![image](https://user-images.githubusercontent.com/48428699/95932446-dae58680-0e06-11eb-8245-9f4c33dbb9d1.png)


- 버튼을 boolean배열로 10까지 생성한 후 망가진 버튼을 false 처리
- 채널의 경우 500,000까지 존재할 수 있어 2배인 1,000,000까지 생성하여 visit배열 생성
- 기준 ans값은 초기 채널이 100이므로 해당 채널부터 위아래로만 이동했을 경우를 위해 Math.ans(100-N)으로 설정
- 100부터 bfs를 돌며 해당 번호를 누를 수 있는지 검사하고, 없다면 위와 아래로 이동하여 검사
- 문제 푼지 오래되어 기억이 잘 나지 않지만, 위보다 아래를 먼저 돌아야 정답 (이유 알면 수정하겠음)
