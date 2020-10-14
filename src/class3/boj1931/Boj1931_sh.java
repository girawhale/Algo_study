package class3.boj1931;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Boj1931_sh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		List<int[]> list = new ArrayList<>();
		for (int i = 0; i < N; i++)
			list.add(new int[] { sc.nextInt(), sc.nextInt() });

		list.sort((i1, i2) -> {
			return i1[1] != i2[1] ? Integer.compare(i1[1], i2[1]) : Integer.compare(i1[0], i2[0]);
		});

		int endtime = -1, cnt = 0;
		for (int[] l : list) {
			if (l[0] >= endtime) {
				endtime = l[1];
				cnt++;
			}
		}
		System.out.println(cnt);

	}
}
