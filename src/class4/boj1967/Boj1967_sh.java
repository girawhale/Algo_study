package class4.boj1967;

import java.util.ArrayList;
import java.util.Scanner;

public class Boj1967_sh {
    static int N;
    static ArrayList<int[]>[] adj;
    static boolean[] visit;
    static int maxDist, node;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        adj = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++)
            adj[i] = new ArrayList<>();

        for (int i = 1; i < N; i++) {
            int n1 = sc.nextInt(), n2 = sc.nextInt(), c = sc.nextInt();
            adj[n1].add(new int[]{n2, c});
            adj[n2].add(new int[]{n1, c});
        }

        if (N == 1) {
            System.out.println(0);
            return;
        }
        visit = new boolean[N + 1];
        dfs(1, 0);
        visit = new boolean[N + 1];
        dfs(node, 0);

        System.out.println(maxDist);

    }

    static void dfs(int n, int dist) {
        if (visit[n])
            return;

        visit[n] = true;

        if (dist > maxDist) {
            maxDist = dist;
            node = n;
        }

        for (int[] a : adj[n]) {
            dfs(a[0], dist + a[1]);
        }
    }
}
