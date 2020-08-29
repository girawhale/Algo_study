package class2.boj4949;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Boj4949_sh {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<>();
		while (true) {
			String input = br.readLine();
			if (input.equals("."))
				break;

			stack.clear();
			int i = -1;
			while (++i < input.length()) {
				char ch = input.charAt(i);
				if (Character.isAlphabetic(ch) || ch == ' ' || ch == '.')
					continue;

				if (ch == '(' || ch == '[')
					stack.add(ch);
				else if (ch == ')') {
					if (stack.isEmpty() || stack.peek() != '(')
						break;
					else
						stack.pop();
				} else {
					if (stack.isEmpty() || stack.peek() != '[')
						break;
					else
						stack.pop();
				}
			}
			sb.append(i == input.length() && stack.isEmpty() ? "yes" : "no").append('\n');
		}
		System.out.println(sb.toString());
	}

}
