package class3.boj11047;

import java.util.Scanner;

public class Boj11047_sh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), K = sc.nextInt();

        int[] A = new int[N];
        for (int i = 0; i < N; i++)
            A[i] = sc.nextInt();

        int cnt = 0;
        for (int i = N - 1; i >= 0 && K > 0; i--) {
            cnt += K / A[i];
            K = K % A[i];
        }
        System.out.println(cnt);
    }
}
