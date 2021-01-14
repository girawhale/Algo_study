package class4.boj1916;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boj1916_tk {

    static class Edge implements Comparable<Edge> {
        int to, weight;

        public Edge(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }

        @Override
        public int compareTo(Edge o) {
            return this.weight - o.weight;
        }
    }
    static int N, M;
    static List<Edge>[] adj;
    static boolean[] visited;
    static int S, E;

    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        adj = new ArrayList[N + 1];
        for(int i = 0; i < N + 1; i++) {
            adj[i] = new ArrayList<>();
        }
        StringTokenizer st;
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            adj[from].add(new Edge(to, w));
        }
        st = new StringTokenizer(br.readLine());
        S = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());

        // 다익스트라 시작
        int[] ret = Dijkstra();
        System.out.println(ret[E]);
    }

    public static int[] Dijkstra() {
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        int[] dist = new int[N + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[S] = 0;
        pq.offer(new Edge(S, 0));
        while(!pq.isEmpty()) {
            Edge cur = pq.poll();
            if(cur.weight > dist[cur.to]) continue;
            for(int i = 0; i < adj[cur.to].size(); i++) {
                int next = adj[cur.to].get(i).to;
                int nextDistance = adj[cur.to].get(i).weight + cur.weight;
                if(nextDistance < dist[next]) {
                    dist[next] = nextDistance;
                    pq.add(new Edge(next, nextDistance));
                }
            }
        }
        return dist;
    }
}
