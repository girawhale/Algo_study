package class3.boj2606;

import java.util.Scanner;

public class Boj2606_sh {
	static int N, ans;
	static boolean[] visit;
	static boolean[][] adj;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();

		visit = new boolean[N + 1];
		adj = new boolean[N + 1][N + 1];
		int m = sc.nextInt();

		for (int i = 0; i < m; i++) {
			int n1 = sc.nextInt(), n2 = sc.nextInt();

			adj[n1][n2] = adj[n2][n1] = true;
		}

		dfs(1);
		System.out.println(ans - 1);

	}

	static void dfs(int n) {
		if (visit[n])
			return;

		visit[n] = true;
		ans++;
		for (int i = 1; i <= N; i++) {
			if (adj[n][i])
				dfs(i);
		}
	}
}
