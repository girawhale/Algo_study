package class2.boj1978;

import java.util.*;

public class Boj1978_sh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean[] prime = new boolean[1001];
		Arrays.fill(prime, true);
		prime[1] = false;

		for (int i = 2; i <= 100; i++)
			if (prime[i])
				for (int j = 2; i * j <= 1000; j++)
					prime[i * j] = false;

		int N = sc.nextInt();
		int cnt = 0;
		for (int i = 0; i < N; i++)
			if (prime[sc.nextInt()])
				cnt++;

		System.out.println(cnt);
	}
 
}
