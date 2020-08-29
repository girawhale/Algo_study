package class2.boj1966;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Boj1966_tk {
	
	static class Doc implements Comparable<Doc>{
		int pri, idx;
		
		public Doc(int pri, int idx) {
			this.pri = pri;
			this.idx = idx;
		}

		@Override
		public int compareTo(Doc o) {
			return o.pri - this.pri;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int t = 0; t < tc; t++) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int ret = 1;
			Queue<Doc> q = new LinkedList<>();
			Queue<Doc> pq = new PriorityQueue<>();
			for(int i = 0; i < n; i++) {
				Doc doc = new Doc(sc.nextInt(), i);
				q.add(doc); pq.add(doc);
			}
			while(!q.isEmpty()) {
				while(q.peek().pri < pq.peek().pri) {
					q.add(q.poll());
				}
				if(q.peek().idx == k) {
					System.out.println(ret);
					break;
				}
				q.poll();
				pq.poll();
				ret++;
			}
		}
	}
}