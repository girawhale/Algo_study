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

---

### :octocat: Taekyung2
![image](https://user-images.githubusercontent.com/37056992/91463072-ea942480-e8c5-11ea-9a19-41affdf475f9.png)

- 람다 comparator, 로직은 위와 동일
- 이전 값과 비교하여 중복일 경우 출력 x 

---

### 😊 JinA

![image](https://user-images.githubusercontent.com/52408122/91919254-3ef13700-ed00-11ea-9044-654c9c36dcf5.png)

- HashSet으로 중복 제거 후, ArrayList로 변환
- Comparator를 활용하여 길이가 같으면 CompareTo를 사용해 사전 순 정렬, 그 외는 길이 순으로 정렬