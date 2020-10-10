package class3.boj2606;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Boj2606_tk {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int cnt = 0;
		int[][] adj = new int[n + 1][n + 1];
		boolean[] visited = new boolean[n + 1];
		for(int i = 0; i < m; i++) {
			int from = sc.nextInt();
			int to = sc.nextInt();
			adj[from][to] = 1;
			adj[to][from] = 1;
		}
		Queue<Integer> q = new LinkedList<>();
		q.add(1);
		visited[1] = true;
		while(!q.isEmpty()) {
			int cur = q.poll();
			for(int i = 1; i <= n; i++) {
				if(visited[i] || adj[cur][i] == 0) continue;
				visited[i] = true;
				q.add(i);
			}
		}
		for(boolean b : visited)
			if(b) cnt++;
		System.out.println(cnt - 1);
	}
}