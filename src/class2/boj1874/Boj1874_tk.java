package class2.boj1874;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Boj1874_tk {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		Stack<Integer> stk = new Stack<>();
		ArrayList<Character> ret = new ArrayList<>();
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		int push = 1;
		int pop = 0;
		while(pop < n) {
			int num = arr[pop];
			if(!stk.isEmpty() && stk.peek() == num) {
				stk.pop();
				ret.add('-');
				pop++;
			}
			else if(num < push) {
				System.out.println("NO");
				return;
			}
			else {
				stk.push(push++);
				ret.add('+');
			}
		}
		for(char c : ret)
			System.out.println(c);
	}
}