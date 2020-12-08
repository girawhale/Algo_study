package class2.boj2805;

import java.util.Scanner;

public class boj2805_hj {
    // int 범위는 +- 21억정도야. 근데 나무의 높이가 10억까지 될 수 있어 -> 10억*나무의 수(=cut)가 int범위를 넘어갈 수 있다!
    // 최대는 10억*100만! 혹시 모르니 long의 범위까지 생각해보자!
    // -2^31~+2^31-1 이 int 범위 (32bit여서) 2^31 = 약 21억. 그래서 2^30 = 10억 정도!
    // long +-2*63. 근데 대~충 생각해서 100만 * 10억은 long 범위 안에서 해결 가능!

    // How do 1n9 approach?
    // 모든 문제를 불 때 입력의 범위 보기 => 숫자가 괴상망측하네? 완탐은 안되겠다...
    // 이분탐색의 조건 1. 처음과 끝 값이 있어야 한다 2. 정렬되어 있어야 한다. (내가 정렬을 해야 될 수도 있다!)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] trees = new int[N];
        int start = 0, end = 0;
        for (int i = 0; i < N; i++) {
            trees[i] = sc.nextInt();
            if (trees[i] > end)
                end = trees[i];
        }

        int result = 0;

        while (start <= end) {
            int mid = (start + end) / 2;

            long cut = 0;
            for (int i = 0; i < N; i++) {
                if (trees[i] > mid)
                    cut += trees[i] - mid;
            }

            if (cut < M) {
                end = mid-1;
            } else {
                start = mid+1;
                result = mid;
            }
        }

        System.out.println(result);

    }
}
