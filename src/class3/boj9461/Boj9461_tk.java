package class3.boj9461;

import java.util.Scanner;

public class Boj9461_tk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        long[] cache = new long[101];
        cache[1] = 1;
        cache[2] = 1;
        cache[3] = 1;
        for(int i = 4; i < 101; i++) {
            cache[i] = cache[i - 2] + cache[i - 3];
        }
        for(int t = 1; t <= tc; t++) {
            int n = sc.nextInt();
            System.out.println(cache[n]);
        }
    }
}