package class3.boj1260;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Boj1260_sh {
	static int N;
	static boolean[] visit;
	static boolean[][] map;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		int M = sc.nextInt(), V = sc.nextInt();

		map = new boolean[N + 1][N + 1];
		visit = new boolean[N + 1];

		for (int i = 0; i < M; i++) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();

			map[n1][n2] = map[n2][n1] = true;
		}

		visit[V] = true;
		dfs(V);
		System.out.println();

		bfs(V);

	}

	static void dfs(int n) {
		System.out.print(n + " ");

		for (int i = 1; i <= N; i++) {
			if (!visit[i] && map[i][n]) {
				visit[i] = true;
				dfs(i);
			}
		}
	}

	static void bfs(int n) {
		Queue<Integer> que = new LinkedList<Integer>();
		visit = new boolean[N + 1];

		visit[n] = true;
		que.add(n);

		while (!que.isEmpty()) {
			int cur = que.poll();
			System.out.print(cur + " ");

			for (int i = 1; i <= N; i++) {
				if (!visit[i] && map[i][cur]) {
					visit[i] = true;
					que.add(i);
				}
			}
		}
	}
}
