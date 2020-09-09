package class2.boj10250;

import java.util.Scanner;

public class Boj10250_sh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();

		for (int tc = 1; tc <= TC; tc++) {
			int H = sc.nextInt(), W = sc.nextInt(), N = sc.nextInt();

			if (N % H == 0)
				System.out.printf("%d%02d\n", H, N / H);
			else
				System.out.printf("%d%02d\n", N % H, (N / H + 1));
		}

	}
}
