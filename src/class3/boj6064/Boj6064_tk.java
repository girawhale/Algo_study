package class3.boj6064;

import java.util.Scanner;

public class Boj6064_tk {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int t = 1; t <= tc; t++) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			int a = m * n / gcd(m, n);
			int ret = -1;
			for(int i = x; i <= a; i+=m)
				if((i - 1) % n + 1 == y) {
					ret = i;
					break;
				}
			System.out.println(ret);
		}
	}
	
	public static int gcd(int a, int b) {
		if(b == 0) return a;
		return gcd(b, a % b);
	}
}