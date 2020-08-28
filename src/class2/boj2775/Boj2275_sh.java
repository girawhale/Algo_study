package class2.boj2775;

import java.util.Scanner;

public class Boj2275_sh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();

		int[][] cnt = new int[15][15];
		for (int i = 1; i <= 14; i++)
			cnt[0][i] = i;

		for (int i = 1; i <= 14; i++)
			for (int j = 1; j <= 14; j++)
				for (int k = 1; k <= j; k++)
					cnt[i][j] += cnt[i - 1][k];

		for (int tc = 1; tc <= TC; tc++) {
			int k = sc.nextInt(), n = sc.nextInt();
			
			System.out.println(cnt[k][n]);
		}
	}
}
