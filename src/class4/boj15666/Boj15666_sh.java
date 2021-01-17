package class4.boj15666;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Boj15666_sh {
    static int N, M;
    static int[] nums, perm;
    static LinkedHashSet<String> ans;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        nums = new int[N];
        perm = new int[M];
        ans = new LinkedHashSet<>();

        for (int i = 0; i < N; i++)
            nums[i] = sc.nextInt();

        Arrays.sort(nums);
        permutation(0, 0);

        ans.forEach(System.out::println);
    }

    static void permutation(int idx, int cnt) {
        if (cnt == M) {
            StringBuilder sb = new StringBuilder();
            for (int p : perm)
                sb.append(p).append(' ');
            ans.add(sb.toString());
            return;
        }

        for (int i = idx; i < N; i++) {
            perm[cnt] = nums[i];
            permutation(i, cnt + 1);
        }
    }
}
