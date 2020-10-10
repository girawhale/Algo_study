package class3.boj1697;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Boj1697_tk {
	static class Point {
		int x, time;
		
		Point(int x, int time) {
			this.x = x;
			this.time = time;
		}
	}	
	static int n, k;
	static boolean[] visited = new boolean[100001];
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();
		System.out.println(bfs());
	}
	
	
	public static int bfs() {
		Queue<Point> q = new LinkedList<>();
		q.add(new Point(n, 0));
		visited[n] = true;
		while(!q.isEmpty()) {
			Point cur = q.poll();
			if(cur.x == k) return cur.time;
			if(cur.x - 1 >= 0 && !visited[cur.x - 1]) {
				q.add(new Point(cur.x - 1, cur.time + 1));
				visited[cur.x - 1] = true;
			}
			if(cur.x + 1 <= 100000 && !visited[cur.x + 1]) {
				q.add(new Point(cur.x + 1, cur.time + 1));
				visited[cur.x + 1] = true;
			}
			if(cur.x * 2 <= 100000 && !visited[cur.x * 2]) {
				q.add(new Point(cur.x * 2, cur.time + 1));
				visited[cur.x * 2] = true;
			}
		}
		return -1;
	}
}