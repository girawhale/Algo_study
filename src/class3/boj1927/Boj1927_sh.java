package class3.boj1927;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Boj1927_sh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		PriorityQueue<Integer> que = new PriorityQueue<>();

		for (int i = 0; i < N; i++) {
			int num = sc.nextInt();
			if (num == 0) {
				if (que.isEmpty())
					System.out.println("0");
				else
					System.out.println(que.poll());
			} else
				que.add(num);
		}
	}
}
