package class2.boj1929;

import java.util.Scanner;

public class Boj1929_tk {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = 1000000;
		boolean[] prime = new boolean[N];
		prime[0] = true;
		prime[1] = true;
		for(int i = 2; i * i < N; i++) {
			if(!prime[i]) {
				for(int j = i * i; j < N; j+=i) {
					prime[j] = true;
				}
			}
		}
		int n = sc.nextInt();
		int m = sc.nextInt();
		for(int i = n; i <= m; i++) {
			if(!prime[i]) System.out.println(i);
		}
	}
}