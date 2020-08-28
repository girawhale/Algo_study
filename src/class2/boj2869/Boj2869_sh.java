package class2.boj2869;

import java.util.Scanner;

public class Boj2869_sh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt(), B = sc.nextInt(), V = sc.nextInt();

		System.out.println((int) Math.ceil((V - A) / (double) (A - B)) + 1);

	}
}
