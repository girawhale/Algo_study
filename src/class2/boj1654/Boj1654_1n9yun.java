package class2.boj1654;

import java.util.Scanner;

public class Boj1654_1n9yun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		int n = sc.nextInt();
		long left = 1;
		long right = (1<<31)-1;
		
		int[] lines = new int[k];
		for(int i=0;i<k;i++) {
			lines[i] = sc.nextInt();
		}
		
		long ans = -1;
		while(left <= right) {
			long mid = (left + right) / 2;
			int cnt = 0;
			
			for(int i=0;i<k;i++) {
				cnt += lines[i] / mid;
			}
			if(cnt < n) {
				right = mid - 1;
			}else {
				left = mid + 1;
				ans = mid;
			}
		}
		
		System.out.println(ans);
	}
}
