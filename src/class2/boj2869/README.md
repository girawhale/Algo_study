## 문제
> [Boj 2869. 달팽이는 올라가고 싶다](https://www.acmicpc.net/problem/2869)


### :whale: girawhale

![image](https://user-images.githubusercontent.com/48428699/91522780-0a633100-e936-11ea-8c69-336b563d404c.png)

- 처음에 범위 안보고 그냥 반복문으로 돌려버림 -> 시간초과
- A 한번은 감소 없이 올라갈 수 있으니 제외하고 하루에 A - B만큼 올라갈 수 있다
- (V - A) / (A - B) 을 계산하면 나머지가 버려지므로 올림을 해주고 A만큼 올라간 날때문에 + 1