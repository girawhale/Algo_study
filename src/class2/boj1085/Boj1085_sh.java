package class2.boj1085;

import java.util.Scanner;

public class Boj1085_sh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(), y = sc.nextInt(), w = sc.nextInt(), h = sc.nextInt();

		System.out.println(Math.min(x, Math.min(y, Math.min(w - x, h - y))));
	}

}
