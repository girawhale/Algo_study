package class3.boj9375;

import java.util.HashMap;
import java.util.Scanner;

public class Boj9375_tk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc =  sc.nextInt();
        for(int t = 1; t <= tc; t++) {
            int n = sc.nextInt();
            HashMap<String, Integer> map = new HashMap<>();
            for(int i = 0; i < n; i++) {
                sc.next();
                String cur = sc.next();
                if (map.containsKey(cur))
                    map.put(cur, map.get(cur) + 1);
                else
                    map.put(cur, 1);
            }
            int ret = 1;
            for(int a : map.values())
                ret *= (a + 1);
            System.out.println(ret - 1);
        }
    }
}