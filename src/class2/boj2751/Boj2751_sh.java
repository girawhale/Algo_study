package class2.boj2751;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Boj2751_sh {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		PriorityQueue<Integer> que = new PriorityQueue<>();

		for (int i = 0; i < N; i++)
			que.add(Integer.parseInt(br.readLine()));

		StringBuilder sb = new StringBuilder();
		while (!que.isEmpty())
			sb.append(que.poll()).append('\n');
		System.out.println(sb.toString());

	}
}
