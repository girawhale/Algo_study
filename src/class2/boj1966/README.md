### 문제
> [Boj 1966. 프린터 큐](https://www.acmicpc.net/problem/1966)


#### :whale: girawhale

![image](https://user-images.githubusercontent.com/48428699/91521430-8f4c4b80-e932-11ea-8eee-863e8248205a.png)

- int[]를 활용한 큐를 사용함 {중요도, 일치여부(1,0)}
- 중요도를 기준으로 카운트 배열을 활용하여 해당 카운트가 0이 아닐 때까지 뽑고 다음 중요도를 뽑으러 감
- 일치여부가 1이면 ck=true 후 break;
- 해당 인덱스를 출력한다

---
#### :octocat: Taekyung2
![image](https://user-images.githubusercontent.com/37056992/91627469-8de25800-e9f2-11ea-92af-6307e551245a.png)

- 문서들을 각각 큐와 우선순위큐에 넣는다
- 우선순위큐의 가장 앞의 원소와 큐의 원소가 같으면 둘다 pop
- 원하는 문서가 나올 때까지 카운트 