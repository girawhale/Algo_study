package class2.boj1018;

import java.util.Scanner;

public class Boj1018_sh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		boolean[][] map = new boolean[N][M];

		for (int i = 0; i < N; i++) {
			String str = sc.next();
			for (int j = 0; j < M; j++)
				map[i][j] = str.charAt(j) == 'W';
		}
 
		boolean start = true;
		int ans = Integer.MAX_VALUE;
		for (int k = 0; k < 2; k++, start = !start) {
			int[][] cnt = new int[N + 1][M + 1];
			boolean line = start;
			for (int i = 0; i < N; i++, line = !line) {
				boolean ck = line;
				for (int j = 0; j < M; j++, ck = !ck) {
					cnt[i + 1][j + 1] = cnt[i][j + 1] + cnt[i + 1][j] - cnt[i][j];
					if (map[i][j] != ck)
						cnt[i + 1][j + 1]++;
				}
			}
			for (int i = 8; i <= N; i++)
				for (int j = 8; j <= M; j++)
					ans = Math.min(ans, cnt[i][j] - cnt[i - 8][j] - cnt[i][j - 8] + cnt[i - 8][j - 8]);

		}
		System.out.println(ans);
	}
}
