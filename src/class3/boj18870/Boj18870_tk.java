package class3.boj18870;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Boj18870_tk {
    static class Pair implements Comparable<Pair> {
        int idx, n, cnt = 0;

        public Pair(int idx, int n) {
            this.idx = idx;
            this.n = n;
        }

        @Override
        public int compareTo(Pair o) {
            return this.n - o.n;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Pair[] arr = new Pair[n];
        for(int i = 0; i < n; i++)
            arr[i] = new Pair(i, Integer.parseInt(st.nextToken()));
        Arrays.sort(arr);
        int idx = 0;
        for(int i = 1; i < n; i++) {
            if(arr[i].n != arr[i - 1].n)
                idx++;
            arr[i].cnt = idx;
        }
        Arrays.sort(arr, Comparator.comparingInt(o -> o.idx));
        for(Pair p : arr)
            System.out.print(p.cnt + " ");
    }
}