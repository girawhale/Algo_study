package class3.boj9205;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Boj9205_tk {
	static class Point {
		int y, x, idx;
		
		public Point(int y, int x, int idx) {
			this.y = y;
			this.x = x;
			this.idx = idx;
		}
	}
	static Point[] map;
	static boolean[] visited;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int t = 1; t <= tc; t++) {
			int n = sc.nextInt();
			map = new Point[n + 2];
			visited = new boolean[n + 2];
			for(int i = 0; i < n + 2; i++)
				map[i] = new Point(sc.nextInt(), sc.nextInt(), i);
			System.out.println(bfs(map[0]));
		}
	}
	
	public static String bfs(Point start) {
		Queue<Point> q = new LinkedList<>();
		q.add(start);
		visited[start.idx] = true;
		while(!q.isEmpty()) {
			Point cur = q.poll();
			if(cur.idx == map[map.length - 1].idx)
				return "happy";
			for(int i = 0; i < map.length; i++) {
				if(visited[i] || (Math.abs(cur.y - map[i].y) + Math.abs(cur.x - map[i].x)) > 1000) continue;
				visited[i] = true;
				q.add(map[i]);
			}
		}
		return "sad";
	}
}