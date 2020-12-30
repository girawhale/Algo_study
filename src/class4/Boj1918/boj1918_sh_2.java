package class4.Boj1918;

import java.util.*;

public class boj1918_sh_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] ch = sc.next().toCharArray();

        Map<Character, Integer> priority = new HashMap<>();
        priority.put('(', 0);
        priority.put('+', 1);
        priority.put('-', 1);
        priority.put('*', 2);
        priority.put('/', 2);

        Deque<Character> stack = new ArrayDeque();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < ch.length; i++) {
            if (Character.isAlphabetic(ch[i])) {
                sb.append(ch[i]);
            } else if (ch[i] == '(') {
                stack.push(ch[i]);
            } else if (ch[i] == ')') {
                char op;
                while ((op = stack.pop()) != '(')
                    sb.append(op);

            } else {
                while (!stack.isEmpty() && priority.get(stack.peek()) >= priority.get(ch[i]))
                    sb.append(stack.pop());

                stack.push(ch[i]);
            }
        }

        while (!stack.isEmpty())
            sb.append(stack.pop());

        System.out.println(sb.toString());


    }
}
