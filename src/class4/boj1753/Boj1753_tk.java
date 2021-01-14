package class4.boj1753;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Boj1753_tk {
    static class Pair implements Comparable<Pair> {
        int first, second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public int compareTo(Pair o) {
            // TODO Auto-generated method stub
            return Integer.compare(o.second, this.second);
        }
    }

    static int V, E, K;
    static ArrayList<Pair>[] adj;

    static int[] dijkstra(int src) {
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src, 0));
        while(!pq.isEmpty()) {
            Pair p = pq.poll();
            int here = p.first;
            int cost = -p.second;
            if(dist[here] < cost) continue;

            for(int i = 0; i < adj[here].size(); ++i) {
                int there = adj[here].get(i).first;
                int nextDist = cost + adj[here].get(i).second;

                if(dist[there] > nextDist) {
                    dist[there] = nextDist;
                    pq.add(new Pair(there, -nextDist));
                }
            }
        }
        return dist;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        V = sc.nextInt();
        E = sc.nextInt();
        K = sc.nextInt() - 1;
        adj = new ArrayList[V];
        for(int i = 0; i < V; i++)
            adj[i] = new ArrayList<Pair>();
        for(int i = 0; i < E; i++) {
            int u = sc.nextInt() - 1, v = sc.nextInt() - 1, w = sc.nextInt();
            adj[u].add(new Pair(v, w));
        }
        int[] ret = dijkstra(K);
        for(int i = 0; i < ret.length; i++) {
            if(ret[i] == Integer.MAX_VALUE) System.out.println("INF");
            else System.out.println(ret[i]);
        }
    }
}
