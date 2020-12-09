package class2.boj2869;

import java.util.Scanner;

public class boj2869_hj {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int V = sc.nextInt();

        int result = 0;

        if ((V-A) % (A-B) == 0) {
            result = (V-A)/(A-B) + 1;
        } else {
            result = (V-A)/(A-B) + 2;
        }

        System.out.println(result);
    }
}
