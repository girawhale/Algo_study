package class2.boj1654;

import java.util.Scanner;

public class Boj1654_tk {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		long[] line = new long[k];
		for(int i = 0; i < k; i++)
			line[i] = sc.nextLong();
		long lo = 1, hi = (long)Math.pow(2, 31) - 1;
		while(lo <= hi) {
			int cnt = 0;
			long mid = (lo + hi) / 2;
			for(int i = 0; i < k; i++)
				cnt += line[i] / mid;
			if(cnt >= n) lo = mid + 1;
			else	hi = mid - 1;
		}
		System.out.println((int)hi);
	}
}
