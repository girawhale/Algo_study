package class2.boj1978;

import java.util.Arrays;
import java.util.Scanner;

public class boj1978_hj {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		int maxL = 0;
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
			maxL = Math.max(arr[i], maxL);
		}
		
		boolean[] prime = new boolean[maxL+1];
		Arrays.fill(prime, true);
		prime[0] = prime[1] = false;
		for (int i = 2; i <= maxL; i++) {
			if (prime[i]) {
				for(int j = 2; i*j <= maxL; j++) {
					prime[i*j] = false;
				}
			}
		}
		
		int result = 0;
		for (int i = 0; i < N; i++) {
			if (prime[arr[i]])
				result++;
		}
		
		System.out.println(result);
	}

}
