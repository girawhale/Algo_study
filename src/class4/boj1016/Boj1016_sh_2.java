package class4.boj1016;

import java.util.Scanner;

public class Boj1016_sh_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long min = sc.nextLong(), max = sc.nextLong();


        boolean[] ck = new boolean[(int) (max - min + 1)];
        for (long i = 2; i * i <= max; i++) {
            long square = i * i;
            long start = min % square == 0 ? min / square : min / square + 1;

            for (long j = start; j * square <= max; j++) {
                if (!ck[(int) (j * square - min)]) {
                    ck[(int) (j * square - min)] = true;
                }
            }

        }

        int cnt = 0;
        for (long i = min; i <= max; i++)
            if (!ck[(int) (i - min)])
                cnt++;

        System.out.println(cnt);

    }
}
