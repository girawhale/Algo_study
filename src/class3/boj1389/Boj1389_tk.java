package class3.boj1389;

import java.util.Arrays;
import java.util.Scanner;

public class Boj1389_tk {
	static int[][] adj = new int[101][101];
	static int n, m;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		for(int i = 0; i < adj.length; i++)
			Arrays.fill(adj[i],  100 * 10000);

		for(int i = 0; i < adj.length; i++)
			adj[i][i] = 0;
		
		for(int i = 0; i < m; i++) {
			int to = sc.nextInt();
			int from = sc.nextInt();
			adj[to][from] = 1;
			adj[from][to] = 1;
		}
		floyd();
		int ret = Integer.MAX_VALUE;
		int answer = 101;
		for(int i = 0; i < 101; i++) {
			int sum = 0;
			for(int j = 0; j < 101; j++) {
				sum += adj[i][j];
			}
			if(ret > sum) {
				ret = sum;
				answer = i;
			}
		}
		System.out.println(answer);
	}
	
	public static void floyd() {
		for(int i = 0; i < 101; i++) {
			for(int j = 0; j < 101; j++) {
				if(adj[j][i] == 0) continue;
				for(int k = 0; k < 101; k++)
					adj[j][k] = Math.min(adj[j][k], adj[j][i] + adj[i][k]);
			}
		}
	}
}