package class2.boj11050;

import java.util.Scanner;

public class boj11050_hj {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int result = 1;
		
		for (int i = N; i > N-K; i--)
			result *= i;
		
		for (int i = K; i > 1; i--)
			result /= i;
		
		System.out.println(result);
	}

}
