package class4.boj2096;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Boj2096_sh {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] map = new int[N][3];

        for (int i = 0; i < N; i++) {
            int[] in = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < 3; j++)
                map[i][j] = in[j];
        }

        int[][] min = new int[N][3];
        int[][] max = new int[N][3];

        min[0] = max[0] = map[0];

        for (int i = 1; i < N; i++) {
            Arrays.fill(min[i], Integer.MAX_VALUE);

            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (Math.abs(j - k) >= 2)
                        continue;

                    min[i][j] = Math.min(min[i][j], min[i - 1][k] + map[i][j]);
                    max[i][j] = Math.max(max[i][j], max[i - 1][k] + map[i][j]);
                }
            }
        }


        System.out.println(Math.max(max[N - 1][0], Math.max(max[N - 1][1], max[N - 1][2])) + " " + Math.min(min[N - 1][0], Math.min(min[N - 1][1], min[N - 1][2])));
    }
}
