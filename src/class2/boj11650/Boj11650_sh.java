package class2.boj11650;

import java.util.Arrays;
import java.util.Scanner;

public class Boj11650_sh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[][] point = new int[N][2];
		for (int i = 0; i < N; i++) {
			point[i][0] = sc.nextInt();
			point[i][1] = sc.nextInt();
		}

		Arrays.sort(point, (a1, a2) -> {
			return a1[0] != a2[0] ? Integer.compare(a1[0], a2[0]) : Integer.compare(a1[1], a2[1]);
		});

		Arrays.stream(point).forEach(o -> {
			System.out.println(o[0] + " " + o[1]);
		});
	}
}
