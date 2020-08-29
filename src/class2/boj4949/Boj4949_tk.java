package class2.boj4949;

import java.util.Scanner;
import java.util.Stack;

public class Boj4949_tk {
	static char[] open = { '(', '[' };
	static char[] close = { ')', ']' };
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			String str = sc.nextLine();
			Stack<Character> stk = new Stack<>();
			boolean chk = true;
			if(str.equals(".")) break;
			loop:
			for(int i = 0; i < str.length(); i++) {
				for(int j = 0; j < 2; j++) {
					if(str.charAt(i) == open[j]) {
						stk.push(open[j]);
						break;
					}
					else if(str.charAt(i) == close[j]) {
						if(!stk.isEmpty() && stk.peek() == open[j]) {
							stk.pop();
						}
						else {
							chk = false;
							break loop;
						}
					}
				}
			}
			if(stk.isEmpty() && chk) System.out.println("yes");
			else	System.out.println("no");
		}
	}
}