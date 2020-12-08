package class3.boj7569;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Boj7569_sh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] dy = { 0, 0, -1, 1, 0, 0 };
		int[] dx = { 0, 0, 0, 0, -1, 1 };
		int[] dz = { -1, 1, 0, 0, 0, 0 };
		int M = sc.nextInt(), N = sc.nextInt(), H = sc.nextInt();

		int[][][] tomato = new int[H][N][M];
		int cnt = 0, days = 0;
		Queue<int[]> que = new LinkedList<>();

		for (int h = 0; h < H; h++) {
			for (int n = 0; n < N; n++)
				for (int m = 0; m < M; m++) {
					tomato[h][n][m] = sc.nextInt();
					if (tomato[h][n][m] == 1)
						que.add(new int[] { h, n, m });
					else if (tomato[h][n][m] == 0)
						cnt++;
				}
		}

		while (cnt > 0 && !que.isEmpty()) {
			for (int s = que.size(); s > 0; s--) {
				int[] cur = que.poll();

				for (int k = 0; k < 6; k++) {
					int nz = cur[0] + dz[k];
					int ny = cur[1] + dy[k];
					int nx = cur[2] + dx[k];

					if (ny < 0 || nx < 0 || nz < 0 || ny >= N || nx >= M || nz >= H || tomato[nz][ny][nx] != 0)
						continue;

					cnt--;
					tomato[nz][ny][nx] = 1;
					que.add(new int[] { nz, ny, nx });
				}
			}
			days++;
		}
		System.out.println(cnt == 0 ? days : -1);

	}
}
