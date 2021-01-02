package class4.boj2407;

import java.math.BigInteger;
import java.util.Scanner;

public class Boj2407_sh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), M = sc.nextInt();
        BigInteger[][] comb = new BigInteger[101][102];

        for (int i = 0; i <= N; i++) {
            comb[i][0] = BigInteger.valueOf(1);
            comb[i][i + 1] = BigInteger.valueOf(0);

            for (int j = 1; j <= i; j++) {
                comb[i][j] = new BigInteger("0");
                comb[i][j] = comb[i - 1][j - 1].add(comb[i - 1][j]);
            }
        }

        System.out.println(comb[N][M]);
    }
}
