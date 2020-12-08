package class2.boj2108;

import java.util.Arrays;
import java.util.Scanner;

public class boj2108_hj {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		int[] freq = new int[8001];
		double sum = 0;
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		int freqN = 0;
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
			freq[arr[i]+4000]++;
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
		}
		
		Arrays.sort(arr);
		
		boolean same = false;
		for (int i = 1; i < freq.length; i++) {
			if (freq[i] > freq[freqN]) {
				same = false;
				freqN = i;
			} else if (freq[i] != 0 && freq[i] == freq[freqN] && !same) {
				same = true;
				freqN = i;
			}
				
		}

		System.out.println(Math.round(sum/arr.length));	// 산술평균
		System.out.println(arr[arr.length/2]);	// 중앙값
		System.out.println(freqN-4000);	// 최빈값
		System.out.println(max-min);	// 범위
	}

}
