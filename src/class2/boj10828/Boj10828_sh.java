package class2.boj10828;

import java.util.Scanner;

public class Boj10828_sh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int top = -1;
		int[] stack = new int[10001];

		for (int i = 0; i < N; i++) {
			switch (sc.next()) {
			case "push":
				stack[++top] = sc.nextInt();
				break;
			case "pop":
				System.out.println(top < 0 ? -1 : stack[top--]);
				break;
			case "size":
				System.out.println(top + 1);
				break;
			case "empty":
				System.out.println(top < 0 ? "1" : "0");
				break;
			case "top":
				System.out.println(top < 0 ? -1 : stack[top]);
				break;
			}
		}
	}
}
