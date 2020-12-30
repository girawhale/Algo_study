package class4.Boj1932;

import java.util.Scanner;

public class boj1932_sh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] nums = new int[N][];

        for (int i = 0; i < N; i++) {
            nums[i] = new int[i + 1];

            for (int j = 0; j <= i; j++)
                nums[i][j] = sc.nextInt();
        }

        for (int i = N - 1; i > 0; i--) {
            for (int j = 0; j < i; j++)
                nums[i-1][j] += Math.max(nums[i][j], nums[i][j + 1]);
        }

        System.out.println(nums[0][0]);

    }
}
