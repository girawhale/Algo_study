package class2.boj10250;

import java.util.Scanner;

public class boj10250_hj {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();
			
			if (N%H == 0) {
				System.out.println(H*100+N/H);
			} else {
				System.out.println(N%H*100+(N/H+1));
			}
		}
		
	}

}
