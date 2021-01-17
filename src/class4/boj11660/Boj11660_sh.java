package class4.boj11660;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Boj11660_sh {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] in = inputToIntArray(br.readLine());
        int N = in[0], M = in[1];

        int[][] map = new int[N + 1][N + 1];
        for (int i = 1; i <= N; i++) {
            in = inputToIntArray(br.readLine());
            for (int j = 1; j <= N; j++)
                map[i][j] = in[j - 1];
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++)
                map[i][j] += map[i - 1][j] + map[i][j - 1] - map[i - 1][j - 1];
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            in = inputToIntArray(br.readLine());

            sb.append(map[in[2]][in[3]] - map[in[0] - 1][in[3]] - map[in[2]][in[1] - 1] + map[in[0] - 1][in[1] - 1]).append('\n');
        }
        System.out.println(sb.toString());

    }

    static int[] inputToIntArray(String input) {
        return Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
    }
}
