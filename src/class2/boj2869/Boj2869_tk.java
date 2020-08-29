package class2.boj2869;

import java.util.Scanner;

public class Boj2869_tk {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), v = sc.nextInt();
		System.out.println((int)Math.ceil((v - a) / (double)(a - b)) + 1);
	}
}