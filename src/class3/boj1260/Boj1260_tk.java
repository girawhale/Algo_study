package class3.boj1260;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Boj1260_tk {
	static int n, m, v;
	static int[][] map = new int[1001][1001];
	static boolean[] visited = new boolean[1001];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		v = sc.nextInt();
		for(int i = 0; i < m; i++) {
			int from = sc.nextInt();
			int to = sc.nextInt();
			map[from][to] = 1;
			map[to][from] = 1;
		}
		visited[v] = true;
		dfs(v);
		System.out.println();
		Arrays.fill(visited, false);
		bfs(v);
	}
	
	public static void dfs(int cur) {
		System.out.print(cur + " ");
		
		for(int i = 1; i <= n; i++) {
			if(map[cur][i] == 0 || visited[i]) continue;
			visited[i] = true;
			dfs(i);
		}
	}
	
	public static void bfs(int start) {
		Queue<Integer> q = new LinkedList<>();
		q.add(start);
		visited[start] = true;
		while(!q.isEmpty()) {
			int cur = q.poll();
			System.out.print(cur + " ");
			for(int i = 1; i <= n; i++) {
				if(map[cur][i] == 0 || visited[i]) continue;
				visited[i] = true;
				q.add(i);
			}
		}
	}
}