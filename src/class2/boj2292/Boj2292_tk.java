package class2.boj2292;

import java.util.Scanner;

public class Boj2292_tk {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = 0, m = 1, ret = 0, max = 0;
		while(n > max) {
			max = k * 6 + 1;
			k += m;
			m++;
			ret++;
		}
		System.out.println(ret);
	}
}