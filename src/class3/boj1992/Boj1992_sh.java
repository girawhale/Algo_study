package class3.boj1992;

import java.util.Scanner;

public class Boj1992_sh {
	static int[][] map;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		map = new int[N][N];

		for (int i = 0; i < N; i++) {
			String input = sc.next();
			for (int j = 0; j < N; j++)
				map[i][j] = input.charAt(j) - '0';
		}
		System.out.println(fn(0, 0, N));
	}

	static String fn(int y, int x, int n) {
		int point = map[y][x];

		for (int i = y; i < y + n; i++) {
			for (int j = x; j < x + n; j++)
				if (map[i][j] != point) {
					return "(" + fn(y, x, n / 2) + fn(y, x + n / 2, n / 2) + fn(y + n / 2, x, n / 2)
							+ fn(y + n / 2, x + n / 2, n / 2) + ")";
				}
		}
		return point + "";
	}

}
