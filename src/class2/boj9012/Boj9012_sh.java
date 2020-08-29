package class2.boj9012;

import java.util.Scanner;
import java.util.Stack;

public class Boj9012_sh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < N; i++) {
			String input = sc.next();
			stack.clear();

			boolean ck = true;
			for (char ch : input.toCharArray()) {
				if (ch == '(')
					stack.push(ch);
				else if (!stack.isEmpty())
					stack.pop();
				else {
					ck = false;
					break;
				}
			}

			sb.append(ck && stack.isEmpty() ? "YES\n" : "NO\n");
		}
		System.out.println(sb.toString());
	}
}
