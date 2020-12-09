package class2.boj2231;

import java.util.Scanner;

public class boj2231_hj {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		int result = 0;
		
		for (int i = 1; i < N; i++) {
			arr[i] = i;
			Integer n = i;
			String ntos = n.toString();
			for (int j = 0; j < ntos.length(); j++) {
				arr[i] += ntos.charAt(j)-'0';
			}
			
			if (arr[i] == N) {
				result = i;
				break;
			}
		}
		
		System.out.println(result);
	}

}
