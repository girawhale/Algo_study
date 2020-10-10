package kakao2021.mun4;

import java.util.Arrays;

public class Solution_tk {
	static int[][] adj;
	
	static void floyd(int V) {
		for(int i = 0; i < V; i++) adj[i][i] = 0;
		for(int k = 0; k < V; k++)
			for(int i = 0; i < V; i++) {
				if(adj[i][k] == 0) continue;
				for(int j = 0; j < V; j++)
					adj[i][j] = Math.min(adj[i][j], adj[i][k] + adj[k][j]);
			}
	}
	
    public int solution(int n, int s, int a, int b, int[][] fares) {
    	adj = new int[n][n];
    	for(int i = 0; i < n; i++)
    		Arrays.fill(adj[i], 100 * 100000);
    	
    	for(int i = 0; i < n; i++)
    		adj[i][i] = 0;
    	
    	for(int i = 0; i < fares.length; i++) {
    		int from = fares[i][0] - 1;
    		int to = fares[i][1] - 1;
    		int cost = fares[i][2]; 
    		adj[from][to] = Math.min(cost,  adj[from][to]);
    		adj[to][from] = Math.min(cost, adj[to][from]);
    	}
    	floyd(n);
    	
    	int answer = Integer.MAX_VALUE;
    	s--; a--; b--;
    	for(int i = 0; i < n; i++)
    		answer = Math.min(answer, adj[s][i] + adj[i][a] + adj[i][b]);
    	
        return answer;
    }
}