package class3.boj15686;

import java.util.ArrayList;
import java.util.Scanner;

public class Boj15686_tk {
    static class Point {
        int y, x;

        public Point(int y, int x) {
                    this.y = y;
                    this.x = x;
                }
            }
        static int n, m, ans = 987654321;
        static ArrayList<Point> home, chicken;
        static ArrayList<Integer> v;

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            m = sc.nextInt();
            home = new ArrayList<>();
            chicken = new ArrayList<>();
            v = new ArrayList<>();

            for(int i = 0; i < n; i++)
                for(int j = 0; j < n; j++) {
                    int a = sc.nextInt();
                    if(a == 1) home.add(new Point(i, j));
                    if(a == 2) chicken.add(new Point(i, j));
            }
        comb(0, 0);
        System.out.println(ans);
    }

    public static void comb(int idx, int cnt) {
        if(idx > chicken.size()) return;
        if(cnt == m) {
            int ret = 0;
            for (Point point : home) {
                int min = 987654321;
                for (int j = 0; j < m; j++) {
                    min = Math.min(min, Math.abs(point.y - chicken.get(v.get(j)).y) + Math.abs(point.x - chicken.get(v.get(j)).x));
                }
                ret += min;
            }
            ans = Math.min(ret, ans);
        }
        v.add(idx);
        comb(idx + 1, cnt + 1);
        v.remove(v.size() - 1);
        comb(idx + 1, cnt);
    }
}