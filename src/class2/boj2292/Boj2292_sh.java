package class2.boj2292;

import java.util.Scanner;

public class Boj2292_sh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int n = 1;
		int bound = 1;

		while (N > bound)
			bound += n++ * 6;

		System.out.println(n);

	}

}
