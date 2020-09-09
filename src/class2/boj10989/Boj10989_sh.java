package class2.boj10989;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj10989_sh {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] cnt = new int[10001];

		for (int i = 0; i < N; i++)
			cnt[Integer.parseInt(br.readLine())]++;

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <= 10000; i++)
			for (int j = 0; j < cnt[i]; j++)
				sb.append(i).append('\n');

		System.out.println(sb.toString());

	}
}
