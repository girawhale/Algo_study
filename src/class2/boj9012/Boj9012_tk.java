package class2.boj9012;

import java.util.Scanner;
import java.util.Stack;

public class Boj9012_tk {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			Stack<Character> stk = new Stack<>();
			String str = sc.next();
			boolean chk = true;
			for(int j = 0; j < str.length(); j++) {
				if(str.charAt(j) == '(') {
					stk.push('(');
					continue;
				}
				else if(str.charAt(j) ==')') {
					if(!stk.isEmpty())
						stk.pop();
					else {
						chk = false;
						break;
					}
				}
			}
			if(stk.isEmpty()) {
				if(chk) 
					System.out.println("YES");
				else
					System.out.println("NO");
			}
			else
				System.out.println("NO");
		}
	}
}