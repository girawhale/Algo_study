package class3.boj1620;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Boj1620_sh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt();

		Map<String, String> map = new HashMap<>();

		for (int i = 1; i <= N; i++) {
			String nm = sc.next();
			String num = Integer.toString(i);
			map.put(nm, num);
			map.put(num, nm);
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < M; i++) {
			sb.append(map.get(sc.next())).append('\n');
		}
		System.out.println(sb.toString());
	}
}
