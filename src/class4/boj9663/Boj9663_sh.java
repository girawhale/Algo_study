package class4.boj9663;

import java.util.Scanner;

public class Boj9663_sh {
    static int N, ans;
    static int[] ck;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        ck = new int[N];

        solve(0);
        System.out.println(ans);
    }

    static void solve(int n) {
        int m = n - 1;
        for (int i = 1; i <= m; i++) {
            if (ck[m] == ck[m - i] || ck[m] - i == ck[m - i] || ck[m] + i == ck[m - i])
                return;
        }

        if (n == N) {
            ans++;
            return;
        }

        for (int i = 0; i < N; i++) {
            ck[n] = i;
            solve(n + 1);
        }
    }
}
