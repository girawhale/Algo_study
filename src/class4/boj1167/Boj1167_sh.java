package class4.boj1167;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Boj1167_sh {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int V = Integer.parseInt(br.readLine());

        ArrayList<int[]>[] adj = new ArrayList[V + 1];
        for (int i = 1; i <= V; i++)
            adj[i] = new ArrayList<>();

        for (int i = 1; i <= V; i++) {
            String[] input = br.readLine().split(" ");

            int n = Integer.parseInt(input[0]);
            int idx = 1;
            while (!input[idx].equals("-1")) {
                int n2 = Integer.parseInt(input[idx++]), d = Integer.parseInt(input[idx++]);
                adj[n].add(new int[]{n2, d});
            }
        }

        int[] ret = dijkstra(1, V, adj);
        ret = dijkstra(ret[0], V, adj);

        System.out.println(ret[1]);
    }

    static int[] dijkstra(int n, int V, ArrayList<int[]>[] adj) {
        int[] dist = new int[V + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[n] = 0;

        PriorityQueue<int[]> que = new PriorityQueue<>(Comparator.comparingInt(o -> o[1]));

        for (int[] i : adj[n])
            que.add(i);

        while (!que.isEmpty()) {
            int[] cur = que.poll();

            if (dist[cur[0]] > cur[1])
                dist[cur[0]] = cur[1];

            for (int[] i : adj[cur[0]]) {
                if (dist[i[0]] > cur[1] + i[1])
                    que.add(new int[]{i[0], cur[1] + i[1]});
            }
        }

        int idx = n;
        for (int i = 1; i <= V; i++)
            if (dist[idx] < dist[i])
                idx = i;

        return new int[]{idx, dist[idx]};
    }
}
