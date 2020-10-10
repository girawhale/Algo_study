package class3.boj1463;

import java.util.Arrays;
import java.util.Scanner;

public class Boj1463_tk {
	static int[] cache = new int[1000001];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Arrays.fill(cache, -1);
		System.out.println(recur(n));
	}
	
	public static int recur(int n) {
		int ret = cache[n];
		if(n == 1) return 0;
		if(ret != -1) return ret;
		ret = Integer.MAX_VALUE;
		if(n % 3 == 0) ret = Math.min(ret, 1 + recur(n / 3));
		if(n % 2 == 0) ret = Math.min(ret,  1 + recur(n / 2));
		ret = Math.min(ret,  1 + recur(n - 1));
		return cache[n] = ret;
	}
}