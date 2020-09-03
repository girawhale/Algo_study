### 문제
> [BOJ 1018. 체스판 다시 칠하기](https://www.acmicpc.net/problem/1018)


#### 🔥 HEE

![image](https://user-images.githubusercontent.com/25292715/91323523-ed2a4780-e7fb-11ea-9c80-2f24f0ec50d2.png)

완탐을 해도 된다고 생각했다.  
그래서 체스판을 만들 수 있는 시작점(왼쪽 위)이 원래의 색일 때, 색을 칠했을 때 두가지 경우로 BFS(우, 하 방향만)를 돌렸다.  
BFS를 써서 시간과 메모리가 어마무시하게 큰 것 같다. 

---

#### :boom:1n9yun

* 찾아야 하는 모양이 주어져 있다
* 그 모양과 가장 가까운 부분을 찾고 다른 부분의 개수를 구하는게 문제
* 체스판 틀을 미리 선언해 놓고 N*M 크기에서 틀을 움직인다
* (1 << 31) - 1 == Integer.MAX_VALUE

---

#### :whale: girawhale
![image](https://user-images.githubusercontent.com/48428699/91385642-5a75c100-e86c-11ea-8f0e-5e8a29ab5f1f.png)

- char로 체크하기 귀찮아서 boolean으로 다를 경우를 체크
- 0,0부터 해당 칸까지 직사각형을 그리고 해당칸까지 다른 값들을 누적
- 8\*8 의 크기를 모두 돌며 가장 작은 값을 찾아  

---

#### :octocat: Taekyung
![image](https://user-images.githubusercontent.com/37056992/91389599-1c7c9b00-e874-11ea-9e03-3310bd9d6e02.png)

- 8 * 8 형태가 나올 때마다 완탐
- 행과 열이 둘다 짝수이거나 홀수면 'W' 아니면 'B'
- 최대 64개에서 바꿀 경우를 카운트
- 64 - cnt 와 cnt 중 작은 것 리턴  

---

### 😊 JinA
![image](https://user-images.githubusercontent.com/52408122/92066760-a3ce8f00-eddd-11ea-9cb4-e218e8972eba.png)

- data는 boolean값으로 저장
- 첫 번째, ( 행:N, 열: M을 8개씩 나눌 때의 경우의 수 )인 change 배열을 두 개 생성 -> start가 검은색(B) or 흰색(W)
- 두 번쨰, 일단 가로 한 줄씩, M을 8개씩 나눌 떄의 경우에 따라 다시 칠해야하는 횟수를 count하여 change 배열에 저장
		(boolean 변수 하나를 switch하여 start의 색상에 따라 count를 다르게 따짐)
- 세 번째, 다음은 세로 한 줄씩, N을 8개씩 나눌 때의 경우에 따라  change 배열의 값을 sum하며, min값과 비교 및 저장
- return min.
