package class2.boj18111;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj18111_sh {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");

		int N = Integer.parseInt(input[0]), M = Integer.parseInt(input[1]), B = Integer.parseInt(input[2]);
		int[][] map = new int[N][M];

		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		for (int i = 0; i < N; i++) {
			input = br.readLine().split(" ");
			for (int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(input[j]);
				min = Math.min(min, map[i][j]);
				max = Math.max(max, map[i][j]);
			}
		}

		int ans = Integer.MAX_VALUE;
		int ansH = -1;
		for (int h = min; h <= max; h++) {
			int b = B;
			int cur = 0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					if (map[i][j] != h) {
						int tmp = map[i][j] - h;
						if (map[i][j] > h)
							cur += tmp * 2;
						else
							cur -= tmp;
						b += tmp;
					}
				}
			}
			if (b >= 0 && ans >= cur) {
				ansH = h;
				ans = cur;
			}
		}

		System.out.println(ans + " " + ansH);

	}
}
