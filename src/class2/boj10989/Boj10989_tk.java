package class2.boj10989;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj10989_tk {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int[] arr = new int[10001];
		for(int i = 0; i < n; i++)
			arr[Integer.parseInt(bf.readLine())]++;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 10001; i++) {
			for(int j = 0; j < arr[i]; j++) {
				sb.append(i).append("\n");
			}
		}
		System.out.println(sb.toString());
	}
}