package class3.boj1764;

import java.util.*;

public class Boj1764_tk {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		HashSet<String> hs1 = new HashSet<>();
		HashSet<String> hs2 = new HashSet<>();
		for(int i = 0; i < n; i++) hs1.add(sc.next());
		for(int i = 0; i < m; i++) hs2.add(sc.next());
		hs1.retainAll(hs2);
		ArrayList<String> li = new ArrayList(hs1);
		Collections.sort(li);
		System.out.println(li.size());
		for(String s : li)
			System.out.println(s);
	}
}