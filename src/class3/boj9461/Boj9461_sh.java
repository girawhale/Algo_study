package class3.boj9461;

import java.util.Scanner;

public class Boj9461_sh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        long[] memo = new long[101];

        memo[1] = memo[2] = memo[3] = 1;
        memo[4] = memo[5] = 2;
        for (int i = 6; i <= 100; i++)
            memo[i] = memo[i - 1] + memo[i - 5];

        for (int tc = 1; tc <= T; tc++)
            System.out.println(memo[sc.nextInt()]);

    }
}
