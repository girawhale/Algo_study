package class2.boj2839;

import java.util.Scanner;

public class Boj2839_sh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int n = N / 5;
		while (n >= 0) {
			if ((N - (5 * n)) % 3 == 0)
				break;
			n--;
		}

		System.out.println(n < 0 ? -1 : n + ((N - (5 * n)) / 3));
	}

}
