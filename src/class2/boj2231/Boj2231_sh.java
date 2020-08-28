package class2.boj2231;

import java.util.Scanner;

public class Boj2231_sh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int num = 1;
		int sum = 0;
		while (num <= N) {
			sum = num;

			int tmp = num;
			while (tmp > 0) {
				sum += tmp % 10;
				tmp /= 10;
			}

			if (sum == N)
				break;

			num++;
		}
		System.out.println(sum != N ? 0 : num);

	}
}
