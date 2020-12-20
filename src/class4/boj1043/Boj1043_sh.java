package class4.boj1043;

import java.util.Scanner;

public class Boj1043_sh {
    static int N, M;
    static boolean[] know;
    static boolean[][] adj;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        know = new boolean[N + 1];
        int len = sc.nextInt();
        for (int i = 0; i < len; i++)
            know[sc.nextInt()] = true;

        int[][] party = new int[M][];
        adj = new boolean[N + 1][N + 1];

        for (int i = 0; i < M; i++) {
            int input = sc.nextInt();
            party[i] = new int[input];

            party[i][0] = sc.nextInt();

            for (int j = 1; j < input; j++) {
                party[i][j] = sc.nextInt();
                adj[party[i][j - 1]][party[i][j]] = adj[party[i][j]][party[i][j - 1]] = true;
            }
        }

        for (int i = 1; i <= N; i++)
            if (know[i])
                dfs(i);

        int cnt = 0;
        for (int i = 0; i < M; i++)
            if (!know[party[i][0]])
                cnt++;

        System.out.println(cnt);


    }

    static void dfs(int n) {
        for (int i = 1; i <= N; i++) {
            if (adj[n][i] && !know[i]) {
                know[i] = true;
                dfs(i);
            }
        }
    }
}
