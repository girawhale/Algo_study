package class4.boj1238;

import java.util.Arrays;
import java.util.Scanner;

public class Boj1238_tk {

    static int N, M, X;
    static int[][] adj;

    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        X = sc.nextInt();
        adj = new int[N + 1][N + 1];
        for(int i = 1; i < N + 1; i++) {
            Arrays.fill(adj[i], 1000000);
        }
        for(int i = 1; i < N + 1; i++)
            adj[i][i] = 0;
        for(int i = 0; i < M; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            int w = sc.nextInt();
            adj[from][to] = w;
        }

        // 플로이드-와샬 시작
        for(int k = 1; k < N + 1; k++) {
            for(int i = 1; i < N + 1; i++) {
                if(adj[i][k] >= 1000000)
                    continue;
                for(int j = 1; j < N + 1; j++) {
                    adj[i][j] = Math.min(adj[i][j], adj[i][k] + adj[k][j]);
                }
            }
        }

        // 최대 소요시간 계산
        int ret = 0;
        for(int i = 1; i < N + 1; i++)
            ret = Math.max(ret, adj[i][X] + adj[X][i]);

        System.out.println(ret);
    }
}
