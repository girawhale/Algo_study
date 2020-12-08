package class2.boj10773;

import java.util.Scanner;
import java.util.Stack;

public class boj10773_hj {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();

        Stack<Integer> st = new Stack<>();
        int result = 0;
        for (int i = 0; i < K ; i++) {
            int n = sc.nextInt();

            if (n != 0) {
                st.push(n);
                result += n;
            } else {
                result -= st.pop();
            }
        }

        System.out.println(result);
    }
}
