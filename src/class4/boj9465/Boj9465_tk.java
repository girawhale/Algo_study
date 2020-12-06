package class4.boj9465;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj9465_tk {
    static int n;
    static int[][] arr;
    static int[][] cache;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int tc = Integer.parseInt(st.nextToken());
        for(int t = 1; t <= tc; t++) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            arr = new int[2][n];
            cache = new int[2][n];
            for(int i = 0; i < 2; i++) {
                st = new StringTokenizer(br.readLine());
                for(int j = 0; j < n; j++)
                    arr[i][j] = Integer.parseInt(st.nextToken());
            }
            cache[0][0] = arr[0][0];
            cache[1][0] = arr[1][0];
            cache[0][1] = arr[1][0] + arr[0][1];
            cache[1][1] = arr[0][0] + arr[1][1];
            for(int i = 2; i < n; i++) {
                cache[0][i] = Math.max(cache[1][i - 2], cache[1][i - 1]) + arr[0][i];
                cache[1][i] = Math.max(cache[0][i - 2], cache[0][i - 1]) + arr[1][i];
            }
            System.out.println(Math.max(cache[0][n - 1], cache[1][n - 1]));
        }
    }
}