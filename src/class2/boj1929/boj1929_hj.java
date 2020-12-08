package class2.boj1929;

import java.util.Arrays;
import java.util.Scanner;

public class boj1929_hj {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		boolean[] arr = new boolean[N+1];
		Arrays.fill(arr, true);
		arr[0] = arr[1] = false;
		
		for (int i = 2; i <= N; i++) {
			if (arr[i]) {
				for (int j = 2; j * i <= N; j++) {
					arr[i*j] = false;
				}
			}
		}
		
		for (int i = M; i <= N; i++) {
			if(arr[i])
				System.out.println(i);
		}
	}
}
