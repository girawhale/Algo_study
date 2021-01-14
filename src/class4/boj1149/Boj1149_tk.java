package class4.boj1149;

import java.util.Scanner;

public class Boj1149_tk {
    static int[][] cache = new int[3][1001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 1; i <= N; i++) {
            int r = sc.nextInt();
            int g = sc.nextInt();
            int b = sc.nextInt();
            cache[0][i] = Math.min(cache[1][i - 1], cache[2][i - 1]) + r;
            cache[1][i] = Math.min(cache[0][i - 1], cache[2][i - 1]) + g;
            cache[2][i] = Math.min(cache[0][i - 1], cache[1][i - 1]) + b;
        }
        System.out.println(Math.min(cache[0][N], Math.min(cache[1][N], cache[2][N])));
    }
}