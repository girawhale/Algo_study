package class4.boj1786;

import java.util.Scanner;

public class Boj1786_sh {
    static int cnt = 0;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String T = sc.nextLine();
        String P = sc.nextLine();

        kmp(T, P);
        System.out.println(cnt);
        System.out.println(sb);
    }

    public static int[] getPi(String pattern) {
        int m = pattern.length();
        int[] pi = new int[m];

        int j = 0;
        for (int i = 1; i < m; i++) {
            while (j > 0 && pattern.charAt(i) != pattern.charAt(j))
                j = pi[j - 1];

            if (pattern.charAt(i) == pattern.charAt(j))
                pi[i] = ++j;
        }

        return pi;
    }

    public static void kmp(String parent, String pattern) {
        int[] pi = getPi(pattern);

        int n = parent.length(), m = pattern.length();

        int j = 0;
        for (int i = 0; i < n; i++) {
            while (j > 0 && parent.charAt(i) != pattern.charAt(j))
                j = pi[j - 1];

            if (parent.charAt(i) == pattern.charAt(j)) {
                if (j == m - 1) {
                    cnt++;
                    sb.append(i - m + 2).append('\n');
                    j = pi[j];
                } else j++;
            }
        }

    }
}
