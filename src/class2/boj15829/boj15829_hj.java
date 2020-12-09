package class2.boj15829;

import java.util.Scanner;

public class boj15829_hj {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        String s = sc.next();
        int r = 31;
        int M = 1234567891; // 10억?
        // 인트 크기 32비트(4바이트)니까 +- 2^31 약 21억
        long result = 0;

        for (int i = 0; i < L; i++) {
            long hash = s.charAt(i)-'a'+1;

            // Math.pow 사용했었는데, 1<=l<=50일 때 31^50 long의 범위도 초과하게 된다
            // 그래서 제곱을 직접 하면서 계속 M으로 나머지 연산 해야됨
            for (int j = 0; j < i; j++)
                hash = (hash * r) % M;
            result = (result + hash) % M;
        }

        System.out.println(result);

    }
}
