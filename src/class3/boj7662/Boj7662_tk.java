package class3.boj7662;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Boj7662_tk {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int tc = Integer.valueOf(st.nextToken());
		for(int t = 1; t <= tc; t++) {
			TreeMap<Integer, Integer> tm = new TreeMap<>();
			st = new StringTokenizer(br.readLine(), " ");
			int k = Integer.valueOf(st.nextToken());
			for(int i = 0; i < k; i++) {
				st = new StringTokenizer(br.readLine(), " ");
				char c = st.nextToken().charAt(0);
				int n = Integer.valueOf(st.nextToken());
				if(c == 'I') {
					if(tm.containsKey(n))
						tm.put(n, tm.get(n) + 1);
					
					else 
						tm.put(n, 1);
				}
				else {
					if(tm.isEmpty()) continue;
					if(n == 1) {
						int maxKey = tm.lastKey();
						int next = tm.get(maxKey) - 1;
						if(next == 0) tm.remove(maxKey);
						else tm.put(maxKey, next);
					}
					else {
						int minKey = tm.firstKey();
						int next = tm.get(minKey) - 1;
						if(next == 0) tm.remove(minKey);
						else tm.put(minKey, next);
					}
				}
			}
			if(tm.isEmpty()) System.out.println("EMPTY");
			else System.out.println(tm.lastKey() + " " + tm.firstKey());
		}
	}
}