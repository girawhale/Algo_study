package class2.boj18111;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj18111_tk {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String tmp = bf.readLine();
		StringTokenizer st = new StringTokenizer(tmp);
		int y = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int[] h = new int[257];
		for(int i = 0; i < y; i++) {
			st = new StringTokenizer(bf.readLine());
			for(int j = 0; j < x; j++) {
				h[Integer.parseInt(st.nextToken())]++;
			}
		}
		int result = Integer.MAX_VALUE;
		int answer = 0;
		for(int i = 256; i >= 0 ; i--) {
			int ret = 0;
			int bb = b;
			
			for(int j = 256; j > i; j--) {
				ret += 2 * h[j] * (j - i);
				bb += h[j] * (j - i);
			}
			
			for(int j = i - 1; j >= 0; j--) {
				ret += h[j] * (i - j);
				bb -= h[j] * (i - j);
			}
			
			if(bb < 0) continue;
			if(ret < result) {
				result = ret;
				answer = i;
			}
		}
		System.out.println(result + " " + answer);
	}
}