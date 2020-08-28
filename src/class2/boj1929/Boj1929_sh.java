package class2.boj1929;

import java.util.Arrays;
import java.util.Scanner;

public class Boj1929_sh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt(), N = sc.nextInt();

		boolean[] prime = new boolean[N + 1];
		Arrays.fill(prime, true);
		prime[1] = false;

		for (int i = 2; i <= N; i++) {
			if (prime[i]) {
				for (int j = 2; i * j <= N; j++)
					prime[i * j] = false;
			}
		}

		for (int i = M; i <= N; i++)
			if (prime[i])
				System.out.println(i);
	}
}
