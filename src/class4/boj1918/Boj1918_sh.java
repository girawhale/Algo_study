package class4.boj1918;

import java.util.*;

public class Boj1918_sh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] ch = sc.next().toCharArray();

        Map<Character, Integer> priority = new HashMap<>();
        priority.put('(', 0);
        priority.put('+', 1);
        priority.put('-', 1);
        priority.put('*', 2);
        priority.put('/', 2);

        Deque<String> numStack = new ArrayDeque();
        Deque<Character> opStack = new ArrayDeque();


        for (int i = 0; i < ch.length; i++) {
            if (Character.isAlphabetic(ch[i])) {
                numStack.push(ch[i] + "");
            } else {
                if (ch[i] == ')') {
                    char op;
                    while ((op = opStack.pop()) != '(') {
                        String post = numStack.pop(), pre = numStack.pop();
                        numStack.push(pre + post + op);
                    }
                } else if (ch[i] == '(' || opStack.isEmpty() || priority.get(opStack.peek()) < priority.get(ch[i])) {
                    opStack.push(ch[i]);
                } else {
                    while (!opStack.isEmpty() && priority.get(opStack.peek()) >= priority.get(ch[i])) {
                        String post = numStack.pop(), pre = numStack.pop();
                        numStack.push(pre + post + opStack.pop());
                    }
                    opStack.push(ch[i]);
                }
            }
        }


        while (!opStack.isEmpty()) {
            String post = numStack.pop(), pre = numStack.pop();
            numStack.push(pre + post + opStack.pop());
        }

        System.out.println(numStack.pop());


    }
}
