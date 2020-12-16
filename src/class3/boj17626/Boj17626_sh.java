package class3.boj17626;

import java.util.Arrays;
import java.util.Scanner;

public class Boj17626_sh {
    static int[] memo;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        memo = new int[n + 1];
        Arrays.fill(memo, Integer.MAX_VALUE);

        System.out.println(solve(n));
    }

    static int solve(int n) {
        if (memo[n] != Integer.MAX_VALUE)
            return memo[n];

        if (n <= 1)
            return n == 1 ? 1 : 0;

        int cnt = Integer.MAX_VALUE;
        for (int i = (int) Math.sqrt(n); i >= 1; i--) {
            cnt = Math.min(solve(n - (int) Math.pow(i, 2)) + 1, cnt);
        }

        return memo[n] = cnt;
    }
}
