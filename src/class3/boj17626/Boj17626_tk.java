package class3.boj17626;

import java.util.Scanner;

public class Boj17626_tk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] cache = new int[n + 1];
        cache[1] = 1;
        for(int i = 2; i <= n; i++) {
            int min = 987654321;
            for(int j = 1; j * j <= i; j++) {
                int tmp = i - j * j;
                min = Math.min(min, cache[tmp]);
            }
            cache[i] = min + 1;
        }
        System.out.println(cache[n]);
    }
}