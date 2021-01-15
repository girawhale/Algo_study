package class4.boj1865;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Boj1865_tk {

    static class Edge {
        int to, weight;

        public Edge(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }
    static int N, M, W;
    static ArrayList<Edge>[] adj;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int t = 1; t <= tc; t++) {
            N = sc.nextInt();
            M = sc.nextInt();
            W = sc.nextInt();
            adj = new ArrayList[N + 1];
            for(int i = 0; i <= N; i++)
                adj[i] = new ArrayList<>();
            for(int i = 0; i < M + W; i++) {
                int S = sc.nextInt();
                int E = sc.nextInt();
                int T = sc.nextInt();
                if(i < M) {
                    adj[S].add(new Edge(E, T));
                    adj[E].add(new Edge(S, T));
                }
                else {
                    adj[S].add(new Edge(E, -T));
                }
            }
            System.out.println(bellmanFord(1) ? "NO" : "YES");
        }
    }

    public static boolean bellmanFord(int start) {
        int[] upper = new int[N + 1];
        Arrays.fill(upper, 1000000);
        upper[start] = 0;

        for(int i = 1; i <= N; i++) {
            for(int j = 1; j <= N; j++) {
                for(Edge e : adj[j]) {
                    if(upper[j] + e.weight < upper[e.to]) {
                        upper[e.to] = upper[j] + e.weight;
                        if(i == N) return false;
                    }
                }
            }
        }
        return true;
    }
}