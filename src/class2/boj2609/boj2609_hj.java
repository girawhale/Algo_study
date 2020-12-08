package class2.boj2609;

import java.util.Scanner;

public class boj2609_hj {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int maxd = 1;
		
		for (int i = 1; i <= Math.min(N, M); i++) {
			if (N % i == 0 && M % i == 0)
				maxd = i;
		}
		
		System.out.println(maxd);
		System.out.println(maxd*(N/maxd)*(M/maxd));
		
	}
}
