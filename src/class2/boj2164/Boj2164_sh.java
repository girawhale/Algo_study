package class2.boj2164;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Boj2164_sh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Queue<Integer> que = new LinkedList<>();

		for (int i = 1; i <= N; i++)
			que.add(i);

		while (que.size() > 1) {
			que.poll();
			que.add(que.poll());
		}
		System.out.println(que.poll());
	}
}
