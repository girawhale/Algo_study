package class2.boj1874;

import java.util.Scanner;
import java.util.Stack;

public class Boj1874_sh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		int num = 1, point = 0;
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		while (num <= n) {
			if (stack.isEmpty() || num <= arr[point]) {
				sb.append('+').append('\n');
				stack.push(num);
			} else 
				break; 
			
			while (point < n && !stack.isEmpty() && stack.peek() == arr[point]) {
				sb.append('-').append('\n');
				stack.pop();
				point++;
			}

			num++;
		}
		System.out.println(point == n ? sb.toString() : "NO");
	}
}
