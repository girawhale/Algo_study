package class2.boj11866;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Boj11866_sh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), K = sc.nextInt();

		Queue<Integer> que = new LinkedList<>();
		IntStream.rangeClosed(1, N).forEach(que::add);

		int cnt = 0;
		StringBuilder sb = new StringBuilder();
		sb.append('<');
		while (!que.isEmpty()) {
			cnt = cnt % K + 1;
			if (cnt == K)
				sb.append(que.poll()).append(',').append(' ');
			else
				que.add(que.poll());

		}
		System.out.println(sb.substring(0, sb.length() - 2).toString() + ">");
	}
}
