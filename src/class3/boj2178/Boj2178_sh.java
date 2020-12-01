package class3.boj2178;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Boj2178_sh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<int[]> que = new LinkedList<>();
		int[] dy = { -1, 1, 0, 0 };
		int[] dx = { 0, 0, -1, 1 };

		int N = sc.nextInt(), M = sc.nextInt();
		boolean[][] map = new boolean[N][M];

		for (int i = 0; i < N; i++) {
			String input = sc.next();

			for (int j = 0; j < M; j++)
				map[i][j] = input.charAt(j) == '1';
		}

		que.add(new int[] { 0, 0, 1 });
		map[0][0] = false;

		while (!que.isEmpty()) {
			int[] cur = que.poll();

			if (cur[0] == N - 1 && cur[1] == M - 1) {
				System.out.println(cur[2]);
				return;
			}

			for (int k = 0; k < 4; k++) {
				int ny = cur[0] - dy[k];
				int nx = cur[1] - dx[k];

				if (ny < 0 || nx < 0 || ny >= N || nx >= M || !map[ny][nx])
					continue;

				que.add(new int[] { ny, nx, cur[2] + 1 });
				map[ny][nx] = false;
			}
		}

	}
}
