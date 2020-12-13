package class3.boj1074;

import java.util.Scanner;

public class Boj1074_sh2 {
    static int N, r, c, cnt;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        r = sc.nextInt();
        c = sc.nextInt();

        solve((int) Math.pow(2, N), 0, 0);
    }

    static void solve(int n, int y, int x) {
        if (y == r && x == c) {
            System.out.println(cnt);
            System.exit(0);
        }

        if (y <= r && r < (y + n) && x <= c && c < (x + n)) {
            int nn = n / 2;
            solve(nn, y, x);
            solve(nn, y, x + nn);
            solve(nn, y + nn, x);
            solve(nn, y + nn, x + nn);
        } else
            cnt += n * n;
    }
}
