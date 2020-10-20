## 문제
> [Boj 1463. 1로 만들기](https://www.acmicpc.net/problem/1463)


### :whale: girawhale

![image](https://user-images.githubusercontent.com/48428699/95933719-37967080-0e0a-11eb-86d7-1077159c4216.png)


- 2부터 1,000,000까지 반복문을 돌며 메모
- 2나 3으로 나누어질 경우 메모한 값을 함께 불러와 min값을 계산후 메모
- 반복문 종료후 입력받은 값의 메모값을 출력

### :octocat: Taekyung2

![image](https://user-images.githubusercontent.com/37056992/96283948-e3f97200-1017-11eb-85ea-ac01b7d39ccd.png)

- 100000보다 작은 정수 N이 주어지고 이것을 1로 만드는 최소 연산을 구해야 함
- x * 3, x * 2, x + 1은 x가 1이 되는 최소값보다 1개의 연산이 많다. 
- 중복되는 계산이 많으므로 메모이제이션을 사용하자.