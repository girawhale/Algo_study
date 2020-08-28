package class2.boj1966;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Boj1966_sh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();

		for (int tc = 1; tc <= TC; tc++) {
			int N = sc.nextInt(), M = sc.nextInt();

			Queue<int[]> que = new LinkedList<int[]>();
			int[] cnt = new int[10];

			for (int i = 0; i < N; i++) {
				int p = sc.nextInt();
				cnt[p]++;
				que.add(new int[] { p, M == i ? 1 : 0 });
			}

			int idx = 0;
			boolean ck = false;
			for (int i = 9; i > 0; i--) {
				int size = que.size();

				for (int s = 0; s < size && !ck && cnt[i] > 0; s++) {
					int[] cur = que.poll();

					if (cur[0] == i) {
						idx++;
						cnt[i]--;

						if (cur[1] == 1)
							ck = true;
					} else
						que.add(cur);
				}
			}

			System.out.println(idx);
		}
	}
}
