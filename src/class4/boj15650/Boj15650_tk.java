package class4.boj15650;

import java.util.ArrayList;
import java.util.Scanner;

public class Boj15650_tk {
    static ArrayList<Integer> v = new ArrayList<>();
    static int n, m;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        comb(0, 0);
    }

    public static void comb(int idx, int cnt) {
        if(idx > n) return;
        if(cnt == m) {
            for(int a : v)
                System.out.print(a + 1 + " ");
            System.out.println();
            return;
        }
        v.add(idx);
        comb(idx + 1, cnt + 1);
        v.remove(v.size() - 1);
        comb(idx + 1, cnt);
    }
}