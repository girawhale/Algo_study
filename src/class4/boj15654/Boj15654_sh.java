package class4.boj15654;

import java.util.Arrays;
import java.util.Scanner;

public class Boj15654_sh {
    static int N, M;
    static int[] nums, perm;
    static boolean[] visit;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        nums = new int[N];
        perm = new int[M];
        visit = new boolean[N];

        for (int i = 0; i < N; i++)
            nums[i] = sc.nextInt();

        Arrays.sort(nums);
        permutation(0);
        System.out.println(sb.toString());
    }

    static void permutation(int cnt) {
        if (cnt == M) {
            for (int p : perm)
                sb.append(p).append(' ');
            sb.append('\n');
            return;
        }

        for (int i = 0; i < N; i++) {
            if (visit[i])
                continue;

            visit[i] = true;
            perm[cnt] = nums[i];
            permutation(cnt + 1);
            visit[i] = false;
        }
    }
}
