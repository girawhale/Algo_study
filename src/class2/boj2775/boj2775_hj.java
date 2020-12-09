package class2.boj2775;

import java.util.Scanner;

public class boj2775_hj {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int[][] apt = new int[15][15];
		for (int i = 0; i <= 14; i++) 
			apt[0][i] = i;
		
		for (int i = 1; i <= 14; i++) {
			for (int j = 1; j <= 14; j++) {
				for (int k = 1; k <= j; k++) {
					apt[i][j] += apt[i-1][k];
				}
			}
		}
		
		for (int t = 0; t < T; t++) {
			int K = sc.nextInt();
			int N = sc.nextInt();
			
			System.out.println(apt[K][N]);
			
		}
	}

}
