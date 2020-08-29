package class2.boj7568;

import java.util.Arrays;
import java.util.Scanner;

public class Boj7568_sh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[][] arr = new int[N][2];
		for (int i = 0; i < N; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}

		int[] rank = new int[N];
		Arrays.fill(rank, 1);
		for (int i = 0; i < N; i++)
			for (int j = 0; j < N; j++)
				if (arr[i][0] > arr[j][0] && arr[i][1] > arr[j][1])
					rank[j]++;

		for (int r : rank)
			System.out.print(r + " ");
	}
}
