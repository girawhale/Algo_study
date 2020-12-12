package class3.boj11399;

import java.util.Arrays;
import java.util.Scanner;

public class Boj11399_sh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] p = new int[n];
        for (int i = 0; i < n; i++)
            p[i] = sc.nextInt();

        Arrays.sort(p);
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += p[i] * (n - i);
        System.out.println(sum);
    }
}