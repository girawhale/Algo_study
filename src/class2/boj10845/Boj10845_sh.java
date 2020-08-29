package class2.boj10845;

import java.util.Scanner;

public class Boj10845_sh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[] que = new int[10001];
		int front = -1, back = -1;

		for (int i = 0; i < N; i++) {
			switch (sc.next()) {
			case "push":
				que[++back] = sc.nextInt();
				break;
			case "pop":
				System.out.println(front != back ? que[++front] : -1);
				break;
			case "size":
				System.out.println(back - front);
				break;
			case "empty":
				System.out.println(back == front ? 1 : 0);
				break;
			case "front":
				System.out.println(front != back ? que[front + 1] : -1);
				break;
			case "back":
				System.out.println(front != back ? que[back] : -1);
				break;
			}
		}
	}
}
