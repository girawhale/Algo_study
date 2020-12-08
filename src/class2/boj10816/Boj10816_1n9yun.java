package class2.boj10816;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Boj10816_1n9yun {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Map<Integer, Integer> map = new HashMap<>();

		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			int num = Integer.parseInt(st.nextToken());
			map.put(num, map.containsKey(num) ? (map.get(num) + 1) : 1);
		}
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<m;i++) {
			int num = Integer.parseInt(st.nextToken());
			bw.write(map.getOrDefault(num, 0) + " ");
		}
		bw.flush();
	}
}
