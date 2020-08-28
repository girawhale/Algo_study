package class2.boj2805;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj2805_sh {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		int[] tree = new int[N];
		for (int i = 0; i < N; i++)
			tree[i] = Integer.parseInt(st.nextToken());

		int start = 0;
		int end = 1000000000;
		int ans = 0;

		while (start <= end) {
			int mid = (start + end) / 2;

			long sum = 0;
			for (int i = 0; i < N; i++)
				sum += tree[i] > mid ? tree[i] - mid : 0;

			if (sum >= M) {
				ans = Math.max(mid, ans);
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}

		System.out.println(ans);

	}
}
