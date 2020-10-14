package class3.boj1780;

import java.util.Scanner;

public class Boj1780_sh {
	static int[] cnt = new int[3];
	static int[][] paper;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		paper = new int[N][N];
		for (int i = 0; i < N; i++)
			for (int j = 0; j < N; j++)
				paper[i][j] = sc.nextInt();

		check(0, 0, N);
		
		for(int c:cnt)
			System.out.println(c);
	}

	static void check(int y, int x, int n) {
		boolean ck = true;
		int num = paper[y][x];

		for (int i = y; i < y + n && ck; i++)
			for (int j = x; j < x + n && ck; j++)
				if (paper[i][j] != num)
					ck = false;

		if (ck) {
			cnt[num + 1]++;
		} else {
			for (int i = 0; i < 3; i++)
				for (int j = 0; j < 3; j++)
					check(y + n / 3 * i, x + n / 3 * j, n / 3);
		}
	}
}
