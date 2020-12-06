package class4.boj15652;

import java.util.Scanner;

public class Boj15652_tk {
    static int n, m;
    static int[] v;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        v = new int[m];
        comb(0, 0);
    }

    public static void comb(int idx, int cnt) {
        if(cnt == m) {
            for(int a : v)
                System.out.print(a + " ");
            System.out.println();
            return;
        }

        for(int i = idx; i < n; i++) {
            v[cnt] = i + 1;
            comb(i, cnt + 1);
        }
    }
}