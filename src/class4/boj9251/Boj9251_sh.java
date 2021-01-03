package class4.boj9251;

import java.util.Scanner;

public class Boj9251_sh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] str1 = (" " + sc.next()).toCharArray();
        char[] str2 = (" " + sc.next()).toCharArray();

        int[][] lcs = new int[str1.length][str2.length];

        for (int i = 1; i < str1.length; i++) {
            for (int j = 1; j < str2.length; j++)
                lcs[i][j] = str1[i] == str2[j] ? lcs[i - 1][j - 1] + 1 : Math.max(lcs[i - 1][j], lcs[i][j - 1]);
        }

        System.out.println(lcs[str1.length - 1][str2.length - 1]);
    }
}
