package class2.boj11651;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Boj11651_sh {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int[][] point = new int[N][2];
		for (int i = 0; i < N; i++) {
			String[] str = br.readLine().split(" ");
			point[i][0] = Integer.parseInt(str[0]);
			point[i][1] = Integer.parseInt(str[1]);
		}

		Arrays.sort(point, (a1, a2) -> {
			return a1[1] != a2[1] ? Integer.compare(a1[1], a2[1]) : Integer.compare(a1[0], a2[0]);
		});

		StringBuilder sb = new StringBuilder();
		Arrays.stream(point).forEach(o -> {
			sb.append(o[0]).append(' ').append(o[1]).append('\n');
		});
		System.out.println(sb.toString());
	}
}
