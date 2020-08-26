package class2.boj1436;

import java.util.Scanner;

public class boj1436_hj {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int cnt = 0;
		
		for (int i = 666; ; i++) {
			Integer in = i;
			String compare = in.toString();
			if (compare.contains("666")) 
				cnt++;
			if (cnt == N) {
				System.out.println(i);
				break;
			}
		}
	}
}
