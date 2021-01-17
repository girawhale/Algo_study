package class4.boj15657;

import java.util.Arrays;
import java.util.Scanner;

public class Boj15657_sh {
    static int N, M;
    static int[] nums, perm;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        nums = new int[N];
        perm = new int[M];

        for (int i = 0; i < N; i++)
            nums[i] = sc.nextInt();

        Arrays.sort(nums);
        permutation(0, 0);

        System.out.println(sb.toString());
    }

    static void permutation(int idx, int cnt) {
        if (cnt == M) {
            for (int p : perm)
                sb.append(p).append(' ');
            sb.append('\n');
            return;
        }

        for (int i = idx; i < N; i++) {
            perm[cnt] = nums[i];
            permutation(i, cnt + 1);
        }
    }
}
