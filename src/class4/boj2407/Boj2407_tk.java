package class4.boj2407;

import java.math.BigInteger;
import java.util.Scanner;

public class Boj2407_tk {
    static BigInteger[][] cache;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        cache = new BigInteger[n + 1][m + 1];
        System.out.println(comb(n, m));
    }

    public static BigInteger comb(int n, int m) {
        if(n == m || m == 0)
            return BigInteger.ONE;
        BigInteger ret = cache[n][m];
        if(ret != null)
            return ret;
        ret = comb(n - 1, m - 1).add(comb(n - 1, m));
        return cache[n][m] = ret;
    }
}