package class3.boj11403;

import java.util.Arrays;
import java.util.Scanner;

public class Boj11403_tk {
    static int N;
    static int[][] adj;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        adj = new int[N][N];
        for(int i = 0; i < N; i++)
            Arrays.fill(adj[i], 100 * 10000);
        for(int i = 0; i < N; i++)
            for(int j = 0; j < N; j++) {
                if(sc.nextInt() == 1)
                    adj[i][j] = 1;
            }
        floyd();
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(adj[i][j] < 1000000) System.out.print(1 + " ");
                else System.out.print(0 + " ");
            }
            System.out.println();
        }
    }

    public static void floyd() {
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(adj[j][i] == 0) continue;
                for(int k = 0; k < N; k++)
                    adj[j][k] = Math.min(adj[j][k], adj[j][i] + adj[i][k]);
            }
        }
    }
}