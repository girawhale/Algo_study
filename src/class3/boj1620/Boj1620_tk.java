package class3.boj1620;

import java.util.HashMap;
import java.util.Scanner;

public class Boj1620_tk {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		HashMap<String, String> m1 = new HashMap<>();
		for(int i = 0; i < n; i++) {
			String str = sc.next();
			m1.put(str, Integer.toString(i + 1));
			m1.put(Integer.toString(i + 1), str);
		}
		for(int j = 0; j < m; j++)
			System.out.println(m1.get(sc.next()));
	}
}