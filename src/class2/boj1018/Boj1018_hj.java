package class2.boj1018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Boj1018_hj {
	static int N, M, result = Integer.MAX_VALUE;
	static char[][] board;
	static int[][] dir = {{0, 1}, {1, 0}};
	
	static class Pos {
		int i, j;
		char status;
		
		Pos(int i, int j, char status) {
			this.i = i;
			this.j = j;
			this.status = status;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] s = br.readLine().split(" ");
		N = Integer.parseInt(s[0]);
		M = Integer.parseInt(s[1]);
		
		board = new char[N][M];
		
		for (int i = 0 ; i < N; i++) {
			String input = br.readLine();
			for (int j = 0; j < M; j++) {
				board[i][j] = input.charAt(j);
			}
		}
		
		for (int i = 0; i <= N-8; i++) {
			for (int j = 0; j <= M-8; j++) {
				bfs(new Pos(i, j, 'B'));
				bfs(new Pos(i, j, 'W'));
			}
		}
		
		System.out.println(result);
	}
	
	static void bfs(Pos p) {
		Queue<Pos> q = new LinkedList<>();
		boolean[][] visited = new boolean[N][M];
		int change = 0;
		
		q.add(p);
		visited[p.i][p.j] = true;
		if (p.status != board[p.i][p.j])
			change++;
		
		while (!q.isEmpty()) {
			Pos now = q.poll();
			
			if (change > result)
				return;
			
			for (int d = 0; d < 2; d++) {
				int ni = now.i + dir[d][0];
				int nj = now.j + dir[d][1];
				
				if (ni < p.i+8 && nj < p.j+8 && !visited[ni][nj]) {
					visited[ni][nj] = true;
					if (now.status == board[ni][nj]) {
						change++;
						q.add(new Pos(ni, nj, board[ni][nj] == 'W' ? 'B' : 'W'));
					} else {
						q.add(new Pos(ni, nj, board[ni][nj]));
					}
				}
			}
		}
		
		if (change < result)
			result = change;
	}
}
