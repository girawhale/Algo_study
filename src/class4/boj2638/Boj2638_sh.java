package class4.boj2638;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Boj2638_sh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dy = {-1, 1, 0, 0};
        int[] dx = {0, 0, -1, 1};
        int N = sc.nextInt(), M = sc.nextInt();

        int[][] map = new int[N][M];
        int cheese = 0, ans = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                map[i][j] = sc.nextInt();
                if (map[i][j] == 1)
                    cheese++;
            }
        }

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0});

        while (cheese > 0) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] cur = queue.poll();
                map[cur[0]][cur[1]] = 10;

                queue.add(cur);
            }

            while (!queue.isEmpty()) {
                int[] cur = queue.poll();

                for (int k = 0; k < 4; k++) {
                    int ny = cur[0] + dy[k];
                    int nx = cur[1] + dx[k];

                    if (ny < 0 || nx < 0 || ny >= N || nx >= M || map[ny][nx] != 0)
                        continue;

                    queue.add(new int[]{ny, nx});
                    map[ny][nx] = 10;
                }
            }

            for (int i = 1; i < N - 1; i++) {
                for (int j = 1; j < M - 1; j++)
                    if (map[i][j] == 1 && (map[i - 1][j] + map[i + 1][j] + map[i][j - 1] + map[i][j + 1]) >= 20) {
                        queue.add(new int[]{i, j});
                    }
            }
            cheese -= queue.size();
            ans++;
        }
        System.out.println(ans);

    }
}
