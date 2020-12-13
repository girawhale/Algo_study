package class3.boj11403;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj11403_sh {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        boolean[][] map = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            for (int j = 0; j < N; j++)
                map[i][j] = input[j].charAt(0) == '1';
        }

        for (int k = 0; k < N; k++)
            for (int i = 0; i < N; i++)
                for (int j = 0; j < N; j++)
                    if (map[i][k] & map[k][j])
                        map[i][j] = true;

        StringBuilder sb = new StringBuilder();
        for (boolean[] con : map) {
            for (boolean b : con)
                sb.append(b ? 1 : 0).append(' ');
            sb.append('\n');
        }
        System.out.println(sb.toString());

    }
}
