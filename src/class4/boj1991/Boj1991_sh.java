package class4.boj1991;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Boj1991_sh {
    static StringBuilder sb = new StringBuilder();
    static Map<Character, char[]> tree = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            char[] in = br.readLine().toCharArray();
            tree.put(in[0], new char[]{in[2], in[4]});
        }

        preOrder('A');
        sb.append('\n');
        inOrder('A');
        sb.append('\n');
        postOrder('A');

        System.out.println(sb.toString());
    }

    static void preOrder(char ch) {
        if (ch == '.')
            return;

        char[] child = tree.get(ch);

        sb.append(ch);
        preOrder(child[0]);
        preOrder(child[1]);
    }

    static void inOrder(char ch) {
        if (ch == '.')
            return;

        char[] child = tree.get(ch);

        inOrder(child[0]);
        sb.append(ch);
        inOrder(child[1]);
    }

    static void postOrder(char ch) {
        if (ch == '.')
            return;

        char[] child = tree.get(ch);

        postOrder(child[0]);
        postOrder(child[1]);
        sb.append(ch);
    }
}
