package class4.boj2206;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Boj2206_sh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), M = sc.nextInt();
        int[] dy = {-1, 1, 0, 0};
        int[] dx = {0, 0, -1, 1};

        boolean[][] map = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            String in = sc.next();
            for (int j = 0; j < M; j++)
                map[i][j] = in.charAt(j) == '0' ? true : false;
        }

        boolean[][][] visit = new boolean[N][M][2];
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0, 1, 1});
        visit[0][0][1] = true;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();

            if (cur[0] == N - 1 && cur[1] == M - 1) {
                System.out.println(cur[3]);
                return;
            }

            for (int k = 0; k < 4; k++) {
                int ny = cur[0] + dy[k];
                int nx = cur[1] + dx[k];

                if (ny < 0 || nx < 0 || ny >= N || nx >= M)
                    continue;

                if (cur[2] == 1 && !visit[ny][nx][0] && !map[ny][nx]) {
                    queue.add(new int[]{ny, nx, 0, cur[3] + 1});
                    visit[ny][nx][0] = true;
                }
                if (!visit[ny][nx][cur[2]] && map[ny][nx]) {
                    queue.add(new int[]{ny, nx, cur[2], cur[3] + 1});
                    visit[ny][nx][cur[2]] = true;
                }
            }
        }

        System.out.println(-1);
    }
}
