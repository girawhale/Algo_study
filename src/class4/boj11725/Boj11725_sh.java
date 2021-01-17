package class4.boj11725;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Boj11725_sh {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer>[] adj = new ArrayList[N + 1];

        for (int i = 1; i <= N; i++)
            adj[i] = new ArrayList<>();

        for (int i = 1; i < N; i++) {
            int[] in = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            adj[in[0]].add(in[1]);
            adj[in[1]].add(in[0]);
        }

        int[] parent = new int[N + 1];
        Queue<Integer> queue = new LinkedList();

        parent[1] = 1;
        queue.add(1);

        while (!queue.isEmpty()) {
            int c = queue.poll();

            for (int a : adj[c]) {
                if (parent[a] != 0)
                    continue;

                parent[a] = c;
                queue.add(a);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 2; i <= N; i++)
            sb.append(parent[i]).append('\n');
        System.out.println(sb.toString());
    }
}
