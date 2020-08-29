package class2.boj10816;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Boj10816_sh {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int NUM = 10000000;

		int[] card = new int[20000001];

		Arrays.stream(br.readLine().split(" ")).forEach(i -> {
			card[Integer.parseInt(i) + NUM]++;
		});

		int M = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		Arrays.stream(br.readLine().split(" ")).forEach(i -> {
			sb.append(card[Integer.parseInt(i) + NUM]).append(' ');
		});
		System.out.println(sb.toString());

	}
}
