package class3.boj2178;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Boj2178_tk {
	static class Point {
		int y, x, d;
		
		Point(int y, int x, int d) {
			this.y = y;
			this.x = x;
			this.d = d;
		}
	}	
	static int[] dy = {-1, 0, 1, 0};
	static int[] dx = {0, 1, 0, -1};
	static char[][] board;
	static int n, m, ret = 0;
	static boolean[][] visited;
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		board = new char[n][m];
		visited = new boolean[n][m];
		for(int i = 0; i < n; i++)
			board[i] = sc.next().toCharArray(); 
		System.out.println(bfs(new Point(0, 0, 0)) + 1);
	}
	
	
	public static int bfs(Point start) {
		Queue<Point> q = new LinkedList<>();
		q.add(start);
		visited[0][0] = true;
		while(!q.isEmpty()) {
			Point cur = q.poll();
			if(cur.y == n - 1 && cur.x == m - 1) {
				return cur.d;
			}
			for(int d = 0; d < 4; d++) {
				int ny = cur.y + dy[d];
				int	nx = cur.x + dx[d];
				if(ny < 0 || nx < 0 || ny >= n || nx >= m || board[ny][nx] == '0' || visited[ny][nx]) continue;
				q.add(new Point(ny, nx, cur.d + 1));
				visited[ny][nx] = true;
			}
		}
		return -1;
	}
}