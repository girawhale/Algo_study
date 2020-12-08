package class2.boj1920;

import java.util.Arrays;
import java.util.Scanner;

public class boj1920_hj {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] nums = new int[N+1];
		for (int i = 1; i <= N; i++) {
			nums[i] = sc.nextInt();
		}
		
		Arrays.sort(nums);
		
		int M = sc.nextInt();
		for (int i = 0; i < M; i++) {
			int find = sc.nextInt();
			
			boolean result = false;
			int sidx = 1, eidx = N;
			
			while(find >= nums[sidx] && find <= nums[eidx]) {
				int midx = (sidx+eidx)/2;

				if (find == nums[midx]) {
					result = true;
					break;
				} else if (find > nums[midx]) {
					sidx = midx+1;
				} else if (find < nums[midx]) {
					eidx = midx-1;
				}
			}
			
			System.out.println(result ? "1" : "0");
		}
	}
}
