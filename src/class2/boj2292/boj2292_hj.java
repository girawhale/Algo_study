package class2.boj2292;

import java.util.Scanner;

public class boj2292_hj {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();

		int result = 1;
		int prev = 1;
		
		for (int i = 1; ; i++) {
			if (N == 1)
				break;
			
			if (prev < N && N <= prev+6*i) {
				result++;
				break;
			} else {
				prev += 6*i;
				result++;
			}
		}
		
		System.out.println(result);
	}

}
