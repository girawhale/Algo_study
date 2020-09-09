package class3.boj1074;

import java.util.Scanner;

public class Boj1074_sh {
	static int[] dy = { 0, 0, 1, 1 };
	static int[] dx = { 0, 1, 0, 1 };

	static int N, r, c, cnt;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		r = sc.nextInt();
		c = sc.nextInt();

		Z(N, 0, 0, 0);

	}

	static void Z(int n, int idx, int y, int x) {
		if (y == r && x == c) {
			System.out.println(cnt);
			System.exit(0);
		}

		if (n > 1 && idx == 0)
			Z(n - 1, 0, y, x);

		if (n != 1 || idx == 0) {
			for (int k = 1; k < 4; k++) {
				cnt++;
				System.out.println(n + " " + (y + n * dy[k]) + " " + (x + n * dx[k]));
				Z(n, k, y + n * dy[k], x + n * dx[k]);
			}
		}
	}
}
