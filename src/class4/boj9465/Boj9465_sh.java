package class4.boj9465;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Boj9465_sh {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            int n = Integer.parseInt(br.readLine());

            int[][] sticker = new int[2][];
            for (int i = 0; i < 2; i++)
                sticker[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            int[][] dp = new int[2][n];
            dp[0][0] = sticker[0][0];
            dp[1][0] = sticker[1][0];
            dp[0][1] = dp[1][0] + sticker[0][1];
            dp[1][1] = dp[0][0] + sticker[1][1];

            int ans = 0;
            for (int i = 2; i < n; i++) {
                dp[0][i] = sticker[0][i] + Math.max(dp[1][i - 1], Math.max(dp[0][i - 2], dp[1][i - 2]));
                dp[1][i] = sticker[1][i] + Math.max(dp[0][i - 1], Math.max(dp[0][i - 2], dp[1][i - 2]));
                ans = Math.max(ans, Math.max(dp[0][i], dp[1][i]));
            }

            System.out.println(ans);
        }

    }
}
