package class3.boj1676;

import java.util.Scanner;

public class Boj1676_1n9yun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int five = 0;
        int two = 0;
        for(int i=n;i>=2;i--){
            int temp = i;
            while(temp % 5 == 0){
                temp /= 5;
                five++;
            }
            temp = i;
            while(temp % 2 == 0){
                temp /= 2;
                two++;
            }
        }
        System.out.println(Math.min(five, two));
    }
}
