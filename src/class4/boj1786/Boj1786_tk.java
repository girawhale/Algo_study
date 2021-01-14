package class4.boj1786;

import java.util.ArrayList;
import java.util.Scanner;

public class Boj1786_tk {
    static ArrayList<Integer> ret = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String origin = sc.nextLine();
        String pattern = sc.nextLine();
        KMP(origin, pattern);
        System.out.println(ret.size());
        for(int n : ret)
            System.out.print((n + 1) + " ");
    }

    public static void KMP(String origin, String pattern) {
        int[] pi = getPi(pattern);
        int j = 0;
        for(int i = 0; i < origin.length(); i++) {
            while(j > 0 && origin.charAt(i) != pattern.charAt(j)) {
                j = pi[j - 1];
            }
            if(origin.charAt(i) == pattern.charAt(j)) {
                if(j == pattern.length() - 1) {
                    ret.add(i - pattern.length() + 1);
                    j = pi[j];
                }
                else
                    j++;
            }
        }
    }

    public static int[] getPi(String pattern) {
        int[] pi = new int[pattern.length()];
        char[] pt = pattern.toCharArray();

        int j = 0;
        for(int i = 1; i < pt.length; i++) {
            while(j > 0 && pt[j] != pt[i]) {
                j = pi[j - 1];
            }
            if(pt[i] == pt[j]) {
                pi[i] = ++j;
            }
        }
        return pi;
    }
}
