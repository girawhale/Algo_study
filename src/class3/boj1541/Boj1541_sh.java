package class3.boj1541;

import java.util.Scanner;

public class Boj1541_sh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.next().split("-");

		int ans = 0;
		int num = 0;

		for (int i = 0; i < input.length; i++) {
			int tmp = 0;
			for (char ch : input[i].toCharArray()) {
				if (Character.isDigit(ch)) {
					num = num * 10 + ch - '0';
				} else {
					tmp += num;
					num = 0;
				}
			}
			tmp += num;
			num = 0;
			if (i != 0) {
				ans -= tmp;
			} else
				ans = tmp;
		}
		System.out.println(ans);
	}
}
