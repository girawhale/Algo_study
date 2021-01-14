package class4.boj1629;

import java.util.Scanner;

public class Boj1629_tk {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        System.out.println(mul(A, B, C) % C);
    }

    public static long mul(long A, long cnt, long C) {
        if(cnt == 0) return 1;
        if(cnt == 1) return A % C;
        if(cnt % 2 == 1)
            return (A * mul(A, cnt - 1 , C)) % C;
        else {
            long tmp = mul(A, cnt / 2, C);
            return (tmp * tmp) % C;
        }
    }
}