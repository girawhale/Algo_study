package class2.boj10814;

import java.util.Arrays;
import java.util.Scanner;

public class Boj10814_sh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[][] arr = new String[N][2];

		for (int i = 0; i < N; i++) {
			arr[i][0] = sc.next();
			arr[i][1] = sc.next();
		}

		Arrays.sort(arr, (s1, s2) -> {
			return Integer.compare(Integer.parseInt(s1[0]), Integer.parseInt(s2[0]));
		});

		Arrays.stream(arr).forEach((a) -> System.out.println(a[0] + " " + a[1]));
	}

}
