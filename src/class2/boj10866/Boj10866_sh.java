package class2.boj10866;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Boj10866_sh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		Deque<Integer> deque = new LinkedList<>();

		for (int i = 0; i < N; i++) {
			switch (sc.next()) {
			case "push_front":
				deque.addFirst(sc.nextInt());
				break;
			case "push_back":
				deque.addLast(sc.nextInt());
				break;
			case "pop_front":
				System.out.println(deque.isEmpty() ? -1 : deque.pollFirst());
				break;
			case "pop_back":
				System.out.println(deque.isEmpty() ? -1 : deque.pollLast());
				break;
			case "size":
				System.out.println(deque.size());
				break;
			case "empty":
				System.out.println(deque.isEmpty() ? 1 : 0);
				break;
			case "front":
				System.out.println(deque.isEmpty() ? -1 : deque.peekFirst());
				break;
			case "back":
				System.out.println(deque.isEmpty() ? -1 : deque.peekLast());
				break;
			}
		}
	}
}
