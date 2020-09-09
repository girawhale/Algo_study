package class2.boj15829;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Boj15829_sh {
	static final int MOD = 1234567891;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		String str = sc.next();
		long[] pow = new long[50];
		pow[0] = 1;
		IntStream.range(1, 50).forEach(i -> {
			pow[i] = pow[i - 1] * 31 % MOD;
		});

		Long hash = 0L;
		for (int i = 0; i < L; i++) {
			hash += (str.charAt(i) - 'a' + 1) * pow[i] % MOD;
			hash = hash % MOD;
		}
		System.out.println(hash);

	}
}
