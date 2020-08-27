package class2.boj1654;

import java.util.Arrays;
import java.util.Scanner;

public class Boj1654_sh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int K = sc.nextInt(), N = sc.nextInt();
		int[] arr = new int[K];
		for (int i = 0; i < K; i++)
			arr[i] = sc.nextInt();

		Arrays.sort(arr);
		long start = 1;
		long end = arr[K - 1];
		long ans = 0;

		while (start <= end) {
			long mid = (start + end) / 2;
			int cnt = 0;

			for (int i : arr)
				cnt += i / mid;

			if (cnt < N)
				end = mid - 1;
			else {
				ans = Math.max(ans, mid);
				start = mid + 1;
			}
		}

		System.out.println(ans);

	}
}
