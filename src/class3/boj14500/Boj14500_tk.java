package class3.boj14500;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj14500_tk {
    private static int[][] dy = {
            {0, 0, 0}, {1, 2, 3}, {0, 1, 1}, {1, 2, 2}, {1, 2, 2},
            {1, 1, 1}, {1, 1, 1}, {1, 1, 2}, {1, 1, 2}, {0, 1, 1},
            {0, 1, 1}, {0, 0, 1}, {1, 1, 1}, {1, 2, 1}, {1, 2, 1},
            {0, 0, 1}, {0, 0, 1}, {0, 1, 2}, {0, 1, 2}
    };
    private static int[][] dx = {
            {1, 2, 3}, {0, 0, 0}, {1, 0, 1}, {0, 0, 1}, {0, 0, -1},
            {0, 1, 2}, {0, -1, -2}, {0, 1, 1}, {0, -1, -1}, {1, 1, 2},
            {-1, -1, -2}, {1, 2, 1}, {-1, 0, 1}, {0, 0, 1}, {0, 0, -1},
            {1, 2, 2}, {-1, -2, -2}, {-1, -1, -1}, {1, 1, 1}
    };

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] map = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                for (int k = 0; k < dy.length; k++) {
                    int sum = 0;
                    sum += map[i][j];
                    for (int l = 0; l < 3; l++) {
                        int nr = i + dy[k][l];
                        int nc = j + dx[k][l];
                        if (nr >= 0 && nr < N && nc >= 0 && nc < M) {
                            sum += map[nr][nc];
                        } else {
                            sum = 0;
                            break;
                        }
                    }
                    if (max < sum)
                        max = sum;
                }
            }
        }
        System.out.println(max);
    }
}