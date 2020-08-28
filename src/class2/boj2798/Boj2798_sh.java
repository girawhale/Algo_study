package class2.boj2798;

import java.util.Scanner;

public class Boj2798_sh {
	static int N, M, ans = 0;
	static boolean[] visit;
	static int[] card;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();

		card = new int[N];
		visit = new boolean[N];
		for (int i = 0; i < N; i++)
			card[i] = sc.nextInt();

		dfs(0, 0, 0);
		System.out.println(ans);

	}

	static void dfs(int idx, int cnt, int sum) {
		if (sum > M || idx >= N)
			return;
		if (cnt == 3) {
			ans = Math.max(ans, sum);
			return;
		}

		for (int i = idx; i < N; i++)
			if (!visit[i]) {
				visit[i] = true;
				dfs(idx + 1, cnt + 1, sum + card[i]);
				visit[i] = false;
			}

	}
}
