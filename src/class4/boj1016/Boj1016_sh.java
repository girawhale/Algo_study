package class4.boj1016;

import java.util.Arrays;
import java.util.Scanner;

public class Boj1016_sh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long min = sc.nextLong(), max = sc.nextLong();

        boolean[] prime = new boolean[1000001];
        Arrays.fill(prime, true);
        prime[1] = false;

        for (int i = 2; i <= 1000000; i++) {
            if (prime[i]) {
                for (int j = 2; i * j <= 1000000; j++)
                    prime[i * j] = false;
            }
        }

        boolean[] ck = new boolean[(int) (max - min + 1)];
        for (long i = 2; i * i <= max; i++) {
            if (!prime[(int) i])
                continue;

            long square = i * i;
            for (long j = min / square + (min % square != 0 ? 1 : 0); j * square <= max; j++) {
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
