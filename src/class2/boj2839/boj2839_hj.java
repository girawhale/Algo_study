package class2.boj2839;

import java.util.Scanner;

public class boj2839_hj {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int result = Integer.MAX_VALUE;

        for (int i = 0; i <= N/5; i++) {
            if ((N-(5*i))%3 == 0) {
                int cnt = i + (N-(5*i))/3;
                if (result > cnt)
                    result = cnt;
            }
        }

        System.out.println(result == Integer.MAX_VALUE ? "-1" : result);

    }
}
