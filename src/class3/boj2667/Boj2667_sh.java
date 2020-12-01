package class3.boj2667;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Boj2667_sh {
	public static void main(String[] args) {
		int[] dy = { -1, 1, 0, 0 };
		int[] dx = { 0, 0, -1, 1 };

		Scanner sc = new Scanner(System.in);
		List<Integer> ans = new ArrayList<>();

		int N = sc.nextInt();
		boolean[][] map = new boolean[N][N];

		for (int i = 0; i < N; i++) {
			String input = sc.next();

			for (int j = 0; j < N; j++)
				map[i][j] = input.charAt(j) == '1';
		}

		Queue<int[]> que = new LinkedList<>();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (!map[i][j])
					continue;

				que.add(new int[] { i, j });
				map[i][j] = false;
				int size = 0;
				while (!que.isEmpty()) {
					int[] cur = que.poll();
					size++;

					for (int k = 0; k < 4; k++) {
						int ny = cur[0] + dy[k];
						int nx = cur[1] + dx[k];

						if (ny < 0 || nx < 0 || nx >= N || ny >= N || !map[ny][nx])
							continue;

						que.add(new int[] { ny, nx });
						map[ny][nx] = false;
					}
				}

				ans.add(size);
			}
		}

		System.out.println(ans.size());
		ans.sort(null);
		ans.stream().forEach(System.out::println);

	}
}
