package class2.boj1181;

import java.util.*;

public class Boj1181_sh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		Set<String> set = new TreeSet<>((s1, s2) -> {
			return s1.length() != s2.length() ? Integer.compare(s1.length(), s2.length()) : s1.compareTo(s2);
		});
		for (int i = 0; i < N; i++)
			set.add(sc.next());

		set.stream().forEach(System.out::println);

	}
}
