package class3.boj1012;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Boj1012_sh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] dy = { -1, 1, 0, 0 };
		int[] dx = { 0, 0, -1, 1 };
		int T = sc.nextInt();

		for (int t = 1; t <= T; t++) {
			int M = sc.nextInt(), N = sc.nextInt(), K = sc.nextInt();

			boolean[][] map = new boolean[M][N];
			for (int i = 0; i < K; i++) {
				map[sc.nextInt()][sc.nextInt()] = true;
			}

			int ans = 0;
			for (int i = 0; i < M; i++) {
				for (int j = 0; j < N; j++) {
					if (!map[i][j])
						continue;

					ans++;
					Queue<int[]> que = new LinkedList<>();
					que.add(new int[] { i, j });
					map[i][j] = false;

					while (!que.isEmpty()) {
						int[] cur = que.poll();

						for (int k = 0; k < 4; k++) {
							int ny = cur[0] + dy[k];
							int nx = cur[1] + dx[k];

							if (ny < 0 || nx < 0 || ny >= M || nx >= N || !map[ny][nx])
								continue;

							que.add(new int[] { ny, nx });
							map[ny][nx] = false;
						}
					}
				}
			}

			System.out.println(ans);
		}

	}
}
