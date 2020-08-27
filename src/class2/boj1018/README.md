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
