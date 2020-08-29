package class2.boj2609;

import java.util.Scanner;

public class Boj2609_tk {
	public static int gcd(int a, int b) {
		if(b == 0) return a;
		return gcd(b, a % b);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt(), q = sc.nextInt();
		System.out.println(gcd(p, q));
		System.out.println(p * q / gcd(p, q));
	}
}