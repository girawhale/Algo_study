package class2.boj1436;

import java.util.Scanner;

public class Boj1436_tk {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		for(int i = 666;;i++) {
			if(String.valueOf(i).contains("666")) cnt++;
			if(cnt == n) {
				System.out.println(i);
				return;
			}
		}
	}
}