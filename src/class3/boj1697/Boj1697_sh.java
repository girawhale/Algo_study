package class3.boj1697;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Boj1697_sh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), K = sc.nextInt();

		int[] memo = new int[200002];
		Arrays.fill(memo, -1);

		Queue<Integer> que = new LinkedList<>();
		memo[N] = 0;
		que.add(N);

		while (!que.isEmpty()) {
			int cur = que.poll();
			if (cur == K)
				break;

			if (cur - 1 > 0 && memo[cur - 1] == -1) {
				que.add(cur - 1);
				memo[cur - 1] = memo[cur] + 1;
			}
			if (cur < K && memo[cur + 1] == -1) {
				que.add(cur + 1);
				memo[cur + 1] = memo[cur] + 1;
			}
			if (cur < K && memo[cur * 2] == -1) {
				que.add(cur * 2);
				memo[cur * 2] = memo[cur] + 1;
			}
		}

		System.out.println(memo[K]);
	}
}
