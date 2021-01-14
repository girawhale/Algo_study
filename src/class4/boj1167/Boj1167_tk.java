package class4.boj1167;

import java.io.*;
import java.util.*;

public class Boj1167_tk {
    static class Edge {
        int idx, dist;
        Edge(int idx, int dist) {
            this.idx = idx;
            this.dist = dist;
        }
    }
    static int V, max = 0, start = 0;
    static boolean[] visited;
    static ArrayList<Edge>[] list;

    public static void dfs(int idx, int dist) {
        visited[idx] = true;
        if(max < dist) {
            max = dist;
            start = idx;
        }

        for(Edge n : list[idx]) {
            if(visited[n.idx]) continue;
            dfs(n.idx, dist + n.dist);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        V = Integer.parseInt(br.readLine());
        list = new ArrayList[V + 1];
        for(int i = 1; i <= V; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            list[from] = new ArrayList<>();
            while(true) {
                int to = Integer.parseInt(st.nextToken());
                if(to == -1) break;
                int dist = Integer.parseInt(st.nextToken());
                list[from].add(new Edge(to, dist));
            }
        }
        visited = new boolean[V + 1];
        dfs(1, 0);
        visited = new boolean[V + 1];
        dfs(start, 0);
        System.out.println(max);
    }
}