package class3.boj2579;

import java.util.Scanner;

public class Boj2579_tk {
	static int[] arr;
	static int[] cache;
	static int n;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new int[n + 1];
		cache = new int[n + 1];
		for(int i = 1; i <= n; i++)
			arr[i] = sc.nextInt();
		if(n == 1) {
			System.out.println(arr[1]);
			return;
		}
		cache[0] = 0;
		cache[1] = arr[1];
		cache[2] = arr[1] + arr[2];
		System.out.println(dp(n));
	}
	
	public static int dp(int n) {
		for(int i = 3; i <= n; i++)
			cache[i] = Math.max(cache[i - 2] + arr[i],  arr[i] + arr[i - 1] + cache[i - 3]);
		return cache[n];
	}
}