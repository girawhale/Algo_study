package class3.boj11399;

import java.util.Arrays;
import java.util.Scanner;

public class Boj11399_tk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Arrays.sort(arr);
        int cnt = 0;
        for(int i = 0; i < n; i++)
            cnt += arr[i] * (n - i);
        System.out.println(cnt);
    }
}