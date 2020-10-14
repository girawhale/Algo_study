package class3.boj1463;

import java.util.Arrays;
import java.util.Scanner;

public class Boj1463_sh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] memo = new int[1000001];
		Arrays.fill(memo, Integer.MAX_VALUE);
		memo[1] = 0;
		for (int n = 2; n <= 1000000; n++) {
			int cnt = Integer.MAX_VALUE;

			if (n % 3 == 0)
				cnt = Math.min(cnt, memo[n / 3] + 1);
			if (n % 2 == 0)
				cnt = Math.min(cnt, memo[n / 2] + 1);

			memo[n] = Math.min(cnt, memo[n - 1] + 1);
		}

		int N = sc.nextInt();
		System.out.println(memo[N]);
	}
}
