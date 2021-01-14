package class4.boj1016;

import java.util.Scanner;

public class Boj1016_tk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long min = sc.nextLong();
        long max = sc.nextLong();
        boolean[] chk = new boolean[(int)(max - min + 1)];
        for(long i = 2; i * i <= max; i++) {
            long power = i * i;
            long start = min % power == 0 ? min / power : (min / power) + 1;
            for(long j = start; j * power <= max; j++)
                chk[(int)(j * power - min)] = true;
        }
        int cnt = 0;
        for(boolean b : chk)
            if(!b) cnt++;
        System.out.println(cnt);
    }
}