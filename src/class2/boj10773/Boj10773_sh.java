package class2.boj10773;

import java.util.Scanner;

public class Boj10773_sh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();

		int point = 0;
		int[] nums = new int[K];
		for (int i = 0; i < K; i++) {
			int num = sc.nextInt();
			if (num == 0)
				point--;
			else
				nums[point++] = num;
		}
		int sum = 0;
		for (int i = 0; i < point; i++)
			sum += nums[i];
		
		System.out.println(sum);
	}
}
