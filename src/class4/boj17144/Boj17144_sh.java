package class4.boj17144;

import java.util.Arrays;
import java.util.Scanner;

public class Boj17144_sh {
    public static void main(String[] args) {
        int[][] dy = {{0, -1, 0, 1}, {0, 1, 0, -1}};
        int[][] dx = {{1, 0, -1, 0}, {1, 0, -1, 0}};
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt(), C = sc.nextInt(), T = sc.nextInt();

        int[][] map = new int[R][C];
        int[][] airCleaner = new int[2][];
        int idx = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                map[i][j] = sc.nextInt();
                if (map[i][j] == -1)
                    airCleaner[idx++] = new int[]{i, j};
            }
        }

        for (int t = 0; t < T; t++) {
            int[][] next = new int[R][];
            for (int i = 0; i < R; i++)
                next[i] = map[i].clone();

            for (int i = 0; i < R; i++) {
                for (int j = 0; j < C; j++) {
                    if (map[i][j] <= 0) continue;

                    int cnt = 0;
                    for (int k = 0; k < 4; k++) {
                        int ny = i + dy[0][k];
                        int nx = j + dx[0][k];

                        if (ny < 0 || nx < 0 || ny >= R || nx >= C || map[ny][nx] == -1)
                            continue;

                        cnt++;
                        next[ny][nx] += map[i][j] / 5;
                    }
                    next[i][j] -= map[i][j] / 5 * cnt;
                }
            }

            for (int i = 0; i < 2; i++) {
                int[] prev = airCleaner[i];
                int dust = 0;

                for (int k = 0; k < 4; k++) {
                    while (true) {
                        int[] n = {prev[0] + dy[i][k], prev[1] + dx[i][k]};

                        if (n[0] < 0 || n[0] >= R || n[1] < 0 || n[1] >= C || (n[0] == airCleaner[i][0] && n[1] == airCleaner[i][1]))
                            break;

                        int tmp = next[n[0]][n[1]];
                        next[n[0]][n[1]] = dust;
                        dust = tmp;
                        prev = n;
                    }
                }
                next[airCleaner[i][0]][airCleaner[i][1]] = -1;
            }
            map = next;
        }

        int sum = 0;
        for (int[] mm : map)
            for (int m : mm)
                sum += m;

        System.out.println(sum + 2);
    }
}
