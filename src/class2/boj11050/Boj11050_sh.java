package class2.boj11050;

import java.util.Scanner;

public class Boj11050_sh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), K = sc.nextInt();

		System.out.println(facto(N) / facto(N - K) / facto(K));
	}

	static int facto(int n) {
		return n <= 1 ? 1 : n * facto(n - 1);
	}

}
