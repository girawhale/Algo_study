package class3.boj1012;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Boj1012_tk {
	static int[] dy = {-1, 0, 1, 0};
	static int[] dx = {0, 1, 0, -1};
	static boolean[][] visited;
	static int[][] map;
	static int m, n, ret;
	
	static class Point {
		int y, x;
		
		Point(int y, int x) {
			this.y = y;
			this.x = x;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int t = 1; t <= tc; t++) {
			m = sc.nextInt();
			n = sc.nextInt();
			ret = 0;
			int k = sc.nextInt();
			map = new int[n][m];
			visited = new boolean[n][m];
			for(int i = 0; i < k; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				map[y][x] = 1;
			}
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < m; j++) {
					if(map[i][j] == 1 && !visited[i][j]) {
						visited[i][j] = true;
						bfs(new Point(i, j));
						ret++;
					}
				}
			}
			System.out.println(ret);
		}
	}
	
	public static void bfs(Point p) {
		Queue<Point> q = new LinkedList<>();
		q.add(p);
		while(!q.isEmpty()) {
			Point cur = q.poll();
			for(int d = 0; d < 4; d++) {
				int ny = cur.y + dy[d];
				int nx = cur.x + dx[d];
				if(ny < 0 || nx < 0 || ny >= n || nx >= m || visited[ny][nx] || map[ny][nx] == 0) continue;
				visited[ny][nx] = true;
				q.add(new Point(ny, nx));
			}
		}
	}
}