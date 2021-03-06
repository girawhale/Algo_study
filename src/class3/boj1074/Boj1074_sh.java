package class3.boj1074;

import java.util.Scanner;

public class Boj1074_sh {
    static int[] dy = {0, 0, 1, 1};
    static int[] dx = {0, 1, 0, 1};

    static int N, r, c, cnt;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        r = sc.nextInt();
        c = sc.nextInt();

        Z((int) Math.pow(2, N), 0, 0);

    }

    static void Z(int n, int y, int x) {
        if (y == r && x == c) {
            System.out.println(cnt);
            System.exit(0);
        }


        if (n > 1) {
            int nn = n / 2;
            for (int k = 0; k < 4; k++)
                Z(nn, y + dy[k] * nn, x + dx[k] * nn);
        } else cnt++;
    }
}
