package class3.boj11286;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Boj11286_tk {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>((lhs, rhs) -> Math.abs(lhs) == Math.abs(rhs) ? lhs - rhs : Math.abs(lhs) - Math.abs(rhs));
        for(int i = 0; i < n; i++) {
            int a = Integer.parseInt(br.readLine());
            if(a != 0)
                pq.add(a);
            else {
                if(!pq.isEmpty())
                    System.out.println(pq.poll());
                else
                    System.out.println(0);
            }
        }
    }
}