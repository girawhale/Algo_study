package class2.boj2164;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Boj2164_tk {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ret = 0;
		Queue<Integer> q = new LinkedList<>();
		for(int i = 1; i <= n; i++) q.add(i);
		while(q.size() > 1) {
			q.poll();
			q.add(q.poll());
		}
		System.out.println(q.peek());
	}
}