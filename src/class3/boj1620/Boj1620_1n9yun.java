package class3.boj1620;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Boj1620_1n9yun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        String[] names = new String[n+1];
        Map<String, Integer> map = new HashMap<>();
        for(int i=1;i<=n;i++){
            names[i] = sc.next();
            map.put(names[i], i);
        }
        for(int i=0;i<m;i++){
            String input = sc.next();
            try{
                int idx = Integer.parseInt(input);
                System.out.println(names[idx]);
            }catch (NumberFormatException e){
                System.out.println(map.get(input));
            }
        }
    }
}
