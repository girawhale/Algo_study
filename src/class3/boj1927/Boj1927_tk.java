package class3.boj1927;

import java.util.*;

public class Boj1927_tk {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		PriorityQueue<Integer> pq = new PriorityQueue<>(100000, (a, b) ->  { return a.compareTo(b); });
		for(int i = 0; i < n; i++) {
			int r = sc.nextInt();
			if(r != 0) pq.offer(r);
			else {
				if(pq.isEmpty()) System.out.println(0);
				else System.out.println(pq.poll());
			}
		}
	}
}