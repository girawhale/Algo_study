package class4.boj15651;

import java.util.Scanner;

public class Boj15651_tk {
    static int n, m;
    static int[] v;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        v = new int[m];
        comb(0);
        System.out.println(sb);
    }

    public static void comb(int cnt) {
        if(cnt == m) {
            for(int a : v)
                sb.append(a).append(" ");
            sb.append("\n");
            return;
        }

        for(int i = 1; i <= n; i++) {
            v[cnt] = i;
            comb(cnt + 1);
        }
    }
}
