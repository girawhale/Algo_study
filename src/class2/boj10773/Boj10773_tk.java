package class2.boj10773;

import java.util.Scanner;
import java.util.Stack;

public class Boj10773_tk {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		Stack<Integer> stk = new Stack<>();
		for(int i = 0; i < k; i++) {
			int num = sc.nextInt();
			if(!stk.isEmpty() && num == 0)
				stk.pop();
			else
				stk.push(num);
		}
		int sum = 0;
		while(!stk.isEmpty())
			sum += stk.pop();
		System.out.println(sum);
	}
}