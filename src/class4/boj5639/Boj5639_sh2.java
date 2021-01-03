package class4.boj5639;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj5639_sh2 {
    static int[] tree = new int[10001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int idx = 0;
        String input;
        while (true) {
            input = br.readLine();
            if (input == null || input.equals(""))
                break;
            tree[idx++] = (Integer.parseInt(input));
        }

        postOrder(0, idx - 1);

    }

    static void postOrder(int n, int end) {
        if (n > end)
            return;

        int mid = n + 1;
        while (mid <= end && tree[mid] < tree[n])
            mid++;

        postOrder(n + 1, mid - 1);
        postOrder(mid, end);
        System.out.println(tree[n]);
    }
}
