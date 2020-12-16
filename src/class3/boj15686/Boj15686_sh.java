package class3.boj15686;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Boj15686_sh {
    static int N, M, ans = Integer.MAX_VALUE;
    static boolean[] ck;
    static List<int[]> home, chicken;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        home = new ArrayList<>();
        chicken = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                switch (sc.nextInt()) {
                    case 1:
                        home.add(new int[]{i, j});
                        break;
                    case 2:
                        chicken.add(new int[]{i, j});
                        break;
                }
        }
        ck = new boolean[chicken.size()];
        comb(-1, 0);

        System.out.println(ans);
    }

    static void comb(int idx, int cnt) {
        if (cnt == M) {
            int dist = 0;

            for (int[] h : home) {
                int tmp = Integer.MAX_VALUE;
                for (int i = 0; i < ck.length; i++) {
                    if (ck[i])
                        tmp = Math.min(tmp, Math.abs(h[0] - chicken.get(i)[0]) + Math.abs(h[1] - chicken.get(i)[1]));
                }
                dist += tmp;
            }
            ans = Math.min(ans, dist);
            return;
        }

        for (int i = idx + 1; i < ck.length; i++) {
            ck[i] = true;
            comb(i, cnt + 1);
            ck[i] = false;
        }
    }
}
