package class3.boj11724;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Boj11724 {
    static int N, M;
    static int[][] adj;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        adj = new int[N][N];
        visited = new boolean[N];
        for(int i = 0; i < M; i++) {
            int from = sc.nextInt() - 1;
            int to = sc.nextInt() - 1;
            adj[from][to] = 1;
            adj[to][from] = 1;
        }
        int cnt = 0;
        for(int i = 0; i < N; i++) {
            if(!visited[i]) {
                bfs(i);
                visited[i] = true;
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    public static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        while(!q.isEmpty()) {
            int cur = q.poll();
            for(int i = 0; i < N; i++) {
                if(!visited[i] && adj[cur][i] == 1) {
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}