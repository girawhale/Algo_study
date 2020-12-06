package class3.boj2630;

import java.util.Scanner;

public class Boj2630_sh {
	static int[] cnt = new int[2];
	static int[][] paper;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		paper = new int[N][N];
		for (int i = 0; i < N; i++)
			for (int j = 0; j < N; j++)
				paper[i][j] = sc.nextInt();

		divide(N, 0, 0);
		for (int n : cnt)
			System.out.println(n);
	}

	static void divide(int n, int y, int x) {
		for (int i = y; i < y + n; i++) {
			for (int j = x; j < x + n; j++)
				if (paper[i][j] != paper[y][x]) {
					divide(n / 2, y, x);
					divide(n / 2, y + n / 2, x);
					divide(n / 2, y, x + n / 2);
					divide(n / 2, y + n / 2, x + n / 2);

					return;
				}
		}

		cnt[paper[y][x]]++;
	}
}
