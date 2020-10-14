package class3.boj1764;

import java.util.*;

public class Boj1764_sh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt();

		Set<String> set = new HashSet<>();
		List<String> list = new ArrayList<>();

		for (int i = 0; i < N; i++)
			set.add(sc.next());

		for (int i = 0; i < M; i++) {
			String name = sc.next();
			if (set.contains(name))
				list.add(name);
		}
		list.sort(null);

		System.out.println(list.size());
		list.stream().forEach(System.out::println);

	}
}
