package class3.boj1676;

import java.util.Scanner;

public class Boj1676_sh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 0;

		for (int n = 1; n <= N; n++)
			cnt += (n % 125 == 0 ? 3 : n % 25 == 0 ? 2 : n % 5 == 0 ? 1 : 0);

		System.out.println(cnt);
	}
}
