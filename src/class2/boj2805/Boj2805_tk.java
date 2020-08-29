package class2.boj2805;

import java.util.Scanner;

public class Boj2805_tk {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long m = sc.nextLong();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) 
			arr[i] = sc.nextInt();
		int lo = 0, hi = 1000000000;
		while(lo <= hi) {
			int mid = (lo + hi) / 2;
			long sum = 0;
			for(int i = 0; i < n; i++)
				if(arr[i] > mid)
					sum += arr[i] - mid;
			if(m <= sum) lo = mid + 1;
			else	hi = mid - 1;
		}
		System.out.println(hi);
	}
}
