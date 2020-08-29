package class2.boj11050;

import java.util.Scanner;

public class Boj11050_tk {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		System.out.println(bino(n, k));
	}
	
	public static int bino(int n, int k) {
		if(k == 0 || k == n) return 1;
		return bino(n - 1, k) + bino(n - 1, k - 1);
	}
}