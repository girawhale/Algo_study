package class4.boj1918;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Boj1918_tk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String s = sc.next();
        ArrayDeque<Character> stk = new ArrayDeque<>();
        for(int i= 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(') {
                stk.push(c);
            }
            else if(c == ')') {
                while(!stk.isEmpty() && stk.peek() != '(') {
                    sb.append(stk.poll());
                }
                stk.poll();
            }
            else if(c >= 'A' && c <= 'Z') {
                sb.append(c);
            }
            else {
                int p = getPriority(c);
                while(!stk.isEmpty() && getPriority(stk.peek()) >= p) {
                    sb.append(stk.poll());
                }
                stk.push(c);
            }
        }
        while(!stk.isEmpty())
            sb.append(stk.poll());
        System.out.println(sb);
    }

    public static int getPriority(char op) {
        if(op == '+' || op == '-') return 1;
        else if(op == '*' || op == '/') return 2;
        else return 0;
    }
}