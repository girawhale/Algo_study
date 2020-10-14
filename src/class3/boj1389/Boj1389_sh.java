package class3.boj1389;

import java.util.Arrays;
import java.util.Scanner;

public class Boj1389_sh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt();

		int[][] map = new int[N + 1][N + 1];

		for (int[] m : map)
			Arrays.fill(m, 200000);

		for (int i = 0; i < M; i++) {
			int a = sc.nextInt(), b = sc.nextInt();
			map[a][b] = map[b][a] = 1;
		}

		for (int k = 1; k <= N; k++) {
			map[k][k] = 0;
			for (int i = 1; i <= N; i++)
				for (int j = 1; j <= N; j++)
					map[i][j] = Math.min(map[i][j], map[i][k] + map[k][j]);
		}

		int sum = Integer.MAX_VALUE, num = 0;

		for (int i = 1; i <= N; i++) {
			int tmpSum = 0;
			for (int j = 1; j <= N; j++)
				tmpSum += map[i][j];

			if (sum > tmpSum) {
				sum = tmpSum;
				num = i;
			}
		}

		System.out.println(num);

	}
}
