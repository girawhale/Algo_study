package class3.boj1541;

import java.util.Scanner;

public class Boj1541_tk {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int num = 0;
		int ret = 0;
		boolean chk = false;
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c >= '0' && c <= '9')
				num = num * 10 + (c - '0');
			else {
				if(chk) ret -= num;
				else ret += num;
				num = 0;
			}
			if(c == '-') chk = true;
		}
		if(chk) ret -= num;
		else ret += num;
		System.out.println(ret);
	}
}
