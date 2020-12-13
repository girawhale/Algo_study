package class3.boj11724;

import java.util.Scanner;

public class Boj11724_sh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), M = sc.nextInt();

        boolean[][] adj = new boolean[N + 1][N + 1];
        for (int i = 0; i < M; i++) {
            int n1 = sc.nextInt(), n2 = sc.nextInt();

            adj[n1][n2] = adj[n2][n1] = true;
        }

        boolean[] visit = new boolean[N + 1];
        int ans = 0;
        for (int i = 1; i <= N; i++) {
            if (!visit[i]) {
                dfs(i, N, adj, visit);
                ans++;
            }
        }

        System.out.println(ans);

    }

    static void dfs(int n, int N, boolean[][] adj, boolean[] visit) {
        visit[n] = true;

        for (int i = 1; i <= N; i++) {
            if (!visit[i] && adj[i][n])
                dfs(i, N, adj, visit);
        }
    }
}
