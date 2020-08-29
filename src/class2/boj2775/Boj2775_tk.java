package class2.boj2775;

import java.util.Scanner;

public class Boj2775_tk {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int t = 1; t <= tc; t++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			int[][] arr = new int[k + 1][n];
			for(int i = 1; i <= n; i++) 
				arr[0][i - 1] = i;
			for(int i = 1; i <= k; i++) {
				for(int j = 0; j < n; j++) {
					for(int r = 0; r <= j; r++) {
						arr[i][j] += arr[i - 1][r];
					}
				}
			}
			System.out.println(arr[k][n - 1]);
		}
	}
}