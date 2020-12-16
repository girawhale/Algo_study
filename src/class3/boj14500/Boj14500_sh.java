package class3.boj14500;

import java.util.Scanner;

public class Boj14500_sh {
    static int N, M, ans;
    static int[][] map;
    static int[] dy = {-1, 1, 0, 0};
    static int[] dx = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        map = new int[N][M];
        for (int i = 0; i < N; i++)
            for (int j = 0; j < M; j++)
                map[i][j] = sc.nextInt();

        boolean[][] visit = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                visit[i][j] = true;
                dfs(i, j, 1, map[i][j], visit);
                visit[i][j] = false;
                search(i, j);
            }
        }
        System.out.println(ans);

    }

    static void dfs(int y, int x, int cnt, int sum, boolean[][] visit) {

        if (cnt >= 4) {
            ans = Math.max(ans, sum);
            return;
        }

        for (int k = 0; k < 4; k++) {
            int ny = y + dy[k];
            int nx = x + dx[k];

            if (ny < 0 || nx < 0 || ny >= N || nx >= M || visit[ny][nx]) {
                continue;
            }

            visit[ny][nx] = true;
            dfs(ny, nx, cnt + 1, sum + map[ny][nx], visit);
            visit[ny][nx] = false;
        }
    }

    static void search(int y, int x) {
        if (y < N - 2 && x < M - 1)
            ans = Math.max(ans, map[y][x] + map[y + 1][x] + map[y + 2][x] + map[y + 1][x + 1]);

        if (y < N - 2 && x > 0)
            ans = Math.max(ans, map[y][x] + map[y + 1][x] + map[y + 2][x] + map[y + 1][x - 1]);

        if (y < N - 1 && x < M - 2)
            ans = Math.max(ans, map[y][x] + map[y][x + 1] + map[y][x + 2] + map[y + 1][x + 1]);

        if (y > 0 && x < M - 2)
            ans = Math.max(ans, map[y][x] + map[y][x + 1] + map[y][x + 2] + map[y - 1][x + 1]);
    }


}
