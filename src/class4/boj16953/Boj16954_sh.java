package class4.boj16953;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Boj16954_sh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(), B = sc.nextInt();

        boolean[] visit = new boolean[1_000_000_001];
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{A, 1});
        visit[A] = true;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();

            if (cur[0] == B) {
                System.out.println(cur[1]);
                System.exit(0);
            }

            int next = cur[0] * 10 + 1;
            if (cur[0] <= B / 10 && !visit[next]) {
                queue.add(new int[]{next, cur[1] + 1});
                visit[next] = true;
            }
            next = cur[0] * 2;
            if (cur[0] <= B / 2 && !visit[next]) {
                queue.add(new int[]{next, cur[1] + 1});
                visit[next] = true;
            }
        }

        System.out.println(-1);
    }
}
