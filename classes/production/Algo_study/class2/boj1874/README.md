### BOJ 1874. 스택 수열
https://www.acmicpc.net/problem/1874

#### :whale: girawhale

![image](https://user-images.githubusercontent.com/48428699/91387431-3fa54b80-e870-11ea-9d7b-4f24cec39f28.png)

- 스택에 넣으면서 스택이 현재 비었거나 뽑아야되는 수보다 작거나 같으면 push
- push 후 출력해야 되는 수와 동일하면 pop, 뽑아야되는 수와 다를 때까지 계속 뽑는다
- 뽑은 수와 n이 다르면 NO, 아니면 값 


---

#### :octocat: Taekyung2
![image](https://user-images.githubusercontent.com/37056992/91516811-5e1a4e00-e927-11ea-9538-43436af6962e.png)

- push 하는 값과 pop 하는 카운트를 이용
- n번 pop 할 때까지 반복

---

#### :boom: 1n9yun
![image](https://user-images.githubusercontent.com/38209225/91534539-a5ff9c00-e94c-11ea-95c2-161893184fb4.png)

- 출력 어케하지 고민했었는데 스트링에 개행 넣으면 되는구나?
- 입력 받은 수 까지 push, 그리고 pop
- 입력 받은 수가 최근에 넣은 수 보다 작으면 pop해야 되는데 그 수는 현재 stack의 top과 같아야 함 다르면 불가능한 경우.

---

#### 😊 JinA

![image](https://user-images.githubusercontent.com/52408122/92339658-3d55b380-f0f2-11ea-8283-4273b9b20bcb.png)

- 스택.isEmpty이 false이고, 출력되야 하는 수와 동일할 때 pop. 그 외는 push
- 전부 출력했으면 string 출력, 아니면 NO 출력
- StringBuffer 안 쓰면 메모리 초과 😥
