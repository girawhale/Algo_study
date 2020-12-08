package class3.boj1541;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Boj1541_1n9yun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String exp = sc.next();
        List<String> splitExp = new LinkedList<>();

        int num = 0;
        for(int i=0;i<exp.length();i++){
            char c = exp.charAt(i);

            if(0 <= c - '0' && c - '0' <= 9){
                num *= 10;
                num += c - '0';
            }else{
                if(num != 0) {
                    splitExp.add(Integer.toString(num));
                    num = 0;
                }
                splitExp.add(Character.toString(c));
            }
        }
        splitExp.add(Integer.toString(num));

        int ans = 0;
        int minus = 0;
        boolean flag = false;
        for(String part : splitExp){
            if(part.equals("-")){
                if(!flag) flag = true;
                else {
                    ans -= minus;
                    minus = 0;
                }
            }else if(!part.equals("+")){
                if(flag) minus += Integer.parseInt(part);
                else ans += Integer.parseInt(part);
            }
        }
        ans -= minus;

        System.out.println(ans);
    }
}
