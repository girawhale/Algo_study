package class2.boj1654;

import java.util.Scanner;

public class boj1654_hj {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int K = sc.nextInt();
		int N = sc.nextInt();
		int[] lans = new int[K];
		long st = 1, end = 0, result = 0;
		for (int i = 0; i < K; i++) {
			lans[i] = sc.nextInt();
			end = Math.max(end, lans[i]);
		}
		
		while(st <= end) {
			long mid = (st+end)/2;
			int cnt = 0;
			
			for (int i = 0; i < K; i++) {
				cnt += lans[i]/mid;
			}
			
			if (cnt < N) {
				end = mid-1;
			} else {
				st = mid+1;
				result = mid;
			}
		}

		System.out.println(result);
	}
}

