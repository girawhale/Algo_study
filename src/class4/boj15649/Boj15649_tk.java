package class4.boj15649;

import java.util.Scanner;

public class Boj15649_tk {
    static int n, m;
    static boolean[] check;
    static int[] v;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        check = new boolean[n + 1];
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
            if(check[i]) continue;
            v[cnt] = i;
            check[i] = true;
            comb(cnt + 1);
            check[i] = false;
        }
    }
}