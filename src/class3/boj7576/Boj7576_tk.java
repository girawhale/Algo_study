package class3.boj7576;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Boj7576_tk {
	static class Point {
		int y, x;
		
		public Point(int y, int x) {
			this.y = y;
			this.x = x;
		}
	}
	static int[] dy = {-1, 0, 1, 0}, dx = {0, 1, 0, -1};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int cnt = 0;
		int[][] board = new int[n][m];
		boolean[][] visited = new boolean[n][m];
		Queue<Point> q = new LinkedList<>();
		for(int i = 0; i < n; i++)
			for(int j = 0; j < m; j++) {
				board[i][j] = sc.nextInt();
				if(board[i][j] == 0) cnt++;
				if(board[i][j] == 1) {
					q.add(new Point(i, j));
					visited[i][j] = true;
				}
			}
		if(cnt == 0) {
			System.out.println(0);
			return;
		}
		int day = -1;
		while(!q.isEmpty()) {
			int size = q.size();
			for(int c = 0; c < size; c++) {
				Point cur = q.poll();
				for(int d = 0; d < 4; d++) {
					int ny = cur.y + dy[d];
					int nx = cur.x + dx[d];
					if(ny < 0 || nx < 0 || ny >= n || nx >= m || visited[ny][nx] || board[ny][nx] != 0) continue;
					visited[ny][nx] = true;
					board[ny][nx] = 1;
					q.add(new Point(ny, nx));
					cnt--;
				}
			}
			day++;
		}
		if(cnt == 0) System.out.println(day);
		else System.out.println(-1);
	}
}