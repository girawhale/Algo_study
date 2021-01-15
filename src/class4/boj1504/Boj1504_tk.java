package class4.boj1504;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Boj1504_tk {
    static class Edge implements Comparable<Edge> {
        int to, w;

        public Edge(int to, int w) {
            this.to = to;
            this.w = w;
        }

        @Override
        public int compareTo(Edge o) {
            return this.w - o.w;
        }
    }
    static int N, E, a, b;
    static ArrayList<Edge>[] adj;

    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        adj = new ArrayList[N + 1];
        for(int i = 0; i < N + 1; i++)
            adj[i] = new ArrayList<>();

        for(int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            adj[from].add(new Edge(to, w));
            adj[to].add(new Edge(from, w));
        }
        st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        // 로직 처리
        int[] start = dijkstra(1);
        int[] A = dijkstra(a);
        int[] B = dijkstra(b);

        int ret = Math.min(start[a] + A[b] + B[N], start[b] + B[a] + A[N]);
        System.out.println(ret >= 1000000 ? -1 : ret);
    }

    public static int[] dijkstra(int start) {
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        int[] dist = new int[N + 1];
        Arrays.fill(dist, 1000000);
        dist[start] = 0;
        pq.add(new Edge(start, 0));

        while(!pq.isEmpty()) {
            Edge cur = pq.poll();
            if(cur.w > dist[cur.to]) continue;
            for(int i = 0; i < adj[cur.to].size(); i++) {
                int next = adj[cur.to].get(i).to;
                int nextDistance = adj[cur.to].get(i).w + cur.w;
                if(nextDistance < dist[next]) {
                    dist[next] = nextDistance;
                    pq.add(new Edge(next, nextDistance));
                }
            }
        }
        return dist;
    }
}
