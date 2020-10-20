package class3.boj11047;

import java.util.Scanner;

public class Boj11047_tk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr  = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int cnt = 0;
        for(int i = n - 1; i >= 0; i--) {
            if(m / arr[i] > 0) {
                cnt += m / arr[i];
                m %= arr[i];
            }
        }
        System.out.println(cnt);
    }
}