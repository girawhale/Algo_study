package class3.boj9375;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Boj9375_sh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            int n = sc.nextInt();
            Map<String, Integer> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                String name = sc.next(), type = sc.next();
                map.put(type, map.getOrDefault(type, 0) + 1);
            }

            int ans = 1;
            for (int val : map.values())
                ans *= val + 1;
            System.out.println(ans - 1);
        }
    }
}
