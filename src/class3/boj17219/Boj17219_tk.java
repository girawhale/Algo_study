package class3.boj17219;

import java.util.HashMap;
import java.util.Scanner;

public class Boj17219_tk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        HashMap<String, String> map = new HashMap<>();
        for(int i = 0; i < n; i++)
            map.put(sc.next(), sc.next());
        for(int i = 0; i < m; i++)
            System.out.println(map.get(sc.next()));
    }
}