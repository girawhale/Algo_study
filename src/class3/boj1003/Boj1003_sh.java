package class3.boj1003;

import java.util.Scanner;

public class Boj1003_sh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		int[][] fibo = new int[41][2];
		fibo[1][1] = 1;
		fibo[0][0] = 1;
		for (int i = 2; i <= 40; i++) {
			fibo[i][0] = fibo[i - 1][0] + fibo[i - 2][0];
			fibo[i][1] = fibo[i - 1][1] + fibo[i - 2][1];
		}

		for (int t = 1; t <= T; t++) {
			int N = sc.nextInt();

			System.out.println(fibo[N][0] + " " + fibo[N][1]);
		}
	}
}
