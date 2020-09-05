package class2.boj1654;

import java.util.Arrays;
import java.util.Scanner;

public class Boj1654_ja {
	/**
	 * 
	 * N개의 랜선을 만들어야 함
	 * 각각 길이가 다른 K개의 랜선을 가지고 있음
	 * 자른 랜선은 다시 재활용할 수 없음
	 * 
	 * K개의 랜선으로 N개의 랜선을 만들 수 없는 경우는 없음
	 * N개보다 많이 만드는 것도 N개를 만드는 것에 포함
	 * 만들 수 있는 최대 랜선의 길이
	 * 
	 * 1<= N <=1,000,000
	 * 1<= K <=10,000
	 * K ≦ N
	 * 랜선의 길이는 2^31-1보다 작거나 같은 자연수
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int K =in.nextInt(); // 가지고 있는 랜선의 개수
		int N = in.nextInt(); // 필요한 랜선의 개수
		
		long[] data = new long[K];
		long sum = 0;
		for(int i=0;i<K;i++) {
			data[i] = in.nextLong();
			sum +=data[i];
		}
		
		Arrays.sort(data);
		long max = 0;
		long start = 1;
		// 적어도 나올 수 있는 최대 랜선 길이
		long end = sum/N;
		
		while(start<=end) {
			long mid = (start+end)/2;
			long cnt = 0;
			for(int i=K-1; i>=0; i--) {
				cnt+=data[i]/mid;
				if(cnt>=N) break;
			}
			if(cnt>=N) {
				max = Math.max(max, mid);
				start = mid+1;
			}else {
				end = mid-1;
			}
		}
		System.out.println(max);
	}
}
