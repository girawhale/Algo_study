package class2.boj2231;

import java.util.Scanner;

public class Boj2231_tk {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ret = 0;
		for(int i = n; i >= 0; i--) {
			String s = String.valueOf(i);
			int cnt = 0;
			for(int j = 0; j < s.length(); j++)
				cnt += s.charAt(j) - '0';
			if(n == i + cnt) ret = i;
		}
		System.out.println(ret);
	}
}