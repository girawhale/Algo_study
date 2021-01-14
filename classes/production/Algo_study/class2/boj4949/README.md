## 문제
> [Boj 4949. 균형잡힌 세상](https://www.acmicpc.net/problem/4949)


### :octocat: Taekyung2

![image](https://user-images.githubusercontent.com/37056992/91627982-81f89500-e9f6-11ea-86ce-f19313bff564.png)

- 소괄호, 대괄호 두가지 종류 
- 여는 괄호를 스택에 넣고, 닫는 괄호가 나왔을 때 최근에 넣은 괄호와 매칭된다면 pop 
- 매칭안되면 false, 스택에 뭐가 들어있어도 false, 닫는 괄호 나왔을 때 스택 비었어도 false 

---

### :whale: girawhale

![image](https://user-images.githubusercontent.com/48428699/91640868-a33f9c80-ea5b-11ea-9a70-535134677421.png)

- 여는 괄호는 무조건 push
- 닫는 괄호가 나왔을 때 괄호의 타입이 일치하는지와 비어있지 않았는지 검사
- 반복문이 끝까지 종료되었는지와 스택이 비었는지 체크
