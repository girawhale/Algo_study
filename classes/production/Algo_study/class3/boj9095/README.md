## 문제
> [Boj 9095. 1, 2, 3 더하기](https://www.acmicpc.net/problem/9095)

### :octocat: Taekyung2
![image](https://user-images.githubusercontent.com/37056992/96331528-ecde5800-1098-11eb-9700-7145d0fda87c.png)

- 상향식으로 반복문 dp
- cache[i] = cache[i - 1] + cache[i - 2] + cache[i - 3];