package class4.boj1865;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Boj1865_sh {
    static int INF = 500 * 10_000;
    static List<int[]> edge;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int TC = sc.nextInt();

        for (int tc = 1; tc <= TC; tc++) {
            int N = sc.nextInt(), M = sc.nextInt(), W = sc.nextInt();
            edge = new ArrayList<>();


            for (int i = 0; i < M; i++) {
                int n1 = sc.nextInt(), n2 = sc.nextInt(), t = sc.nextInt();
                edge.add(new int[]{n1, n2, t});
                edge.add(new int[]{n2, n1, t});
            }
            for (int i = 0; i < W; i++) {
                int n1 = sc.nextInt(), n2 = sc.nextInt(), t = sc.nextInt();

                edge.add(new int[]{n1, n2, -t});
            }


            System.out.println(bellmanFord(N) ? "NO" : "YES");

        }

    }

    static boolean bellmanFord(int N) {
        int[] dist = new int[N + 1];

        Arrays.fill(dist, INF);
        dist[1] = 0;

        for (int n = 0; n <= N; n++) {
            for (int[] e : edge) {
                if (dist[e[1]] > dist[e[0]] + e[2]) {
                    if (n == N)
                        return false;

                    dist[e[1]] = dist[e[0]] + e[2];
                }
            }
        }

        return true;
    }
}
