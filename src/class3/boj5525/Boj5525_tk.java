package class3.boj5525;

import java.util.Scanner;

public class Boj5525_tk {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s = sc.nextInt();
		String str = sc.next();
		int cnt = 0;
		int ret = 0;
		for(int i = 1; i < s; i++) {
			if(str.charAt(i - 1) == 'I' && str.charAt(i) == 'O') {
				cnt++;
			}
			else if (str.charAt(i - 1) == 'O' && str.charAt(i) == 'I') {
				if(cnt >= n) 
					ret++;
			}
			else 
				cnt = 0;
		}
		System.out.println(ret);
	}
}