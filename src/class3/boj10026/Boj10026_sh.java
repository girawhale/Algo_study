package class3.boj10026;

import java.util.Scanner;

public class Boj10026_sh {
    static int[] dy = {-1, 1, 0, 0};
    static int[] dx = {0, 0, -1, 1};
    static int N;
    static char[][] map;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        map = new char[N][N];
        for (int i = 0; i < N; i++)
            map[i] = sc.next().toCharArray();

        int[] ans = {0, 0};
        boolean[][][] visit = new boolean[2][N][N];
        for (int k = 0; k < 2; k++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (!visit[k][i][j]) {
                        dfs(i, j, visit[k], map[i][j]);
                        ans[k]++;
                    }
                    if (map[i][j] == 'G')
                        map[i][j] = 'R';
                }
            }
        }
        System.out.println(ans[0] + " " + ans[1]);

    }

    static void dfs(int y, int x, boolean[][] visit, char ch) {
        visit[y][x] = true;

        for (int k = 0; k < 4; k++) {
            int ny = y + dy[k];
            int nx = x + dx[k];

            if (ny < 0 || nx < 0 || ny >= N || nx >= N || visit[ny][nx] || map[ny][nx] != ch)
                continue;
            dfs(ny, nx, visit, ch);
        }
    }


}
