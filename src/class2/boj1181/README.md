## BOJ1181. 단어 정렬

 https://www.acmicpc.net/problem/1181



### 🔥 HEE

![image](https://user-images.githubusercontent.com/25292715/91323308-b6ecc800-e7fb-11ea-997e-795cf9bc836f.png)

Comparator을 사용하여 단어의 길이가 다르면 짧은 순으로, 같으면 사전순으로(compareTo) 정렬하였다.

---

### :whale: girawhale

![image](https://user-images.githubusercontent.com/48428699/91386149-5b5b2280-e86d-11ea-9821-4fcf10318e5e.png)

- set을 사용해 중복을 제거하였고 TreeSet을 이용해 String을 정렬
- Comparator를 활용하여 길이가 다르면 길이순, 같으면 CompareTo를 사용해 사전 순 정렬
