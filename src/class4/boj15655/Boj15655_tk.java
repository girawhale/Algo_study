package class4.boj15655;

import java.util.Arrays;
import java.util.Scanner;

public class Boj15655_tk {
    static int n, m;
    static boolean[] chk;
    static int[] v, arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        chk = new boolean[n];
        v = new int[m];
        arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Arrays.sort(arr);
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
            if(!chk[i]) {
                chk[i] = true;
                v[cnt] = arr[i];
                comb(i, cnt + 1);
                chk[i] = false;
            }
        }
    }
}
