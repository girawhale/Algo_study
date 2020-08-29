package class2.boj2798;

import java.util.Scanner;

public class Boj2798_tk {
	static int ret = 0;
	static int n, m;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
		comb(arr, 0, 0, 0);
		System.out.println(ret);
	}
	
	public static void comb(int[] arr, int cnt, int cur, int sum) {
		if(sum > m) return;
		if(cnt == 3) {
			ret = Math.max(sum, ret);
			return;
		}
		if(cur >= n) return;
		comb(arr, cnt + 1, cur + 1, sum + arr[cur]);
		comb(arr, cnt, cur + 1, sum);
	}
}