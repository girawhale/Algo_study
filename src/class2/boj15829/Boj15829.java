package class2.boj15829;

import java.util.Scanner;

public class Boj15829 {
	static final int MOD = 1234567891;
	static final int MULTIPLY = 31;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		String s = sc.next();
		long sum = 0;
		long r = 1;
		
		for(int i = 0; i < s.length(); i++) {
			sum = (sum + (s.charAt(i) - 'a' + 1) * r) % MOD;
			r = (r * MULTIPLY) % MOD;
		}
		System.out.println(sum);
	}
}