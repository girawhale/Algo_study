package class3.boj9095;

import java.util.Scanner;

public class Boj9095_sh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		int[] memo = new int[11];
		memo[1] = 1;
		memo[2] = 2;
		memo[3] = 4;
		for (int i = 4; i <= 10; i++)
			memo[i] = memo[i - 1] + memo[i - 2] + memo[i - 3];

		for (int tc = 1; tc <= T; tc++) {
			int n = sc.nextInt();
			System.out.println(memo[n]);
		}
	}
}
