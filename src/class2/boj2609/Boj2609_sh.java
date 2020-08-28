package class2.boj2609;

import java.util.Scanner;

public class Boj2609_sh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt();

		int n = Math.max(N, M), m = Math.min(N, M);

		int gcd = gcd(n, m);
		System.out.println(gcd);
		System.out.println(n * m / gcd);

	}

	static int gcd(int n, int m) {
		return m == 0 ? n : gcd(m, n % m);
	}
}
