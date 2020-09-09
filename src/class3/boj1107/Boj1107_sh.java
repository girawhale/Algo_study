package class3.boj1107;

import java.util.*;

public class Boj1107_sh {
	static boolean[] btn = new boolean[10];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt();

		Arrays.fill(btn, true);

		for (int i = 0; i < M; i++)
			btn[sc.nextInt()] = false;

		boolean[] visit = new boolean[1000000];
		Queue<Integer> que = new LinkedList<Integer>();

		que.add(N);
		visit[N] = true;

		int cnt = 0;
		boolean ck = false;
		int ans = Math.abs(100 - N);

		while (!que.isEmpty() && !ck) {
			int size = que.size();

			cnt++;
			for (int s = 0; s < size; s++) {
				int cur = que.poll();

				int tmp = (int) (cnt + (cur == 0 ? 0 : Math.log10(cur)));
				if (ans < tmp)
					continue;

				if (ck(cur)) {
					ans = tmp;
					ck = true;
					break;
				}

				if (cur > 0 && !visit[cur - 1]) {
					visit[cur - 1] = true;
					que.add(cur - 1);
				}
				if (!visit[cur + 1]) {
					visit[cur + 1] = true;
					que.add(cur + 1);
				}
			}
		}
		System.out.println(ans);
	}

	static boolean ck(int num) {
		if (num == 0)
			return btn[0];

		while (num > 0) {
			int n = num % 10;
			if (!btn[n])
				return false;

			num /= 10;
		}

		return true;
	}
}
