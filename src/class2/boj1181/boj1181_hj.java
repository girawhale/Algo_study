package class2.boj1181;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class boj1181_hj {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String[] words = new String[N];
		
		for (int i = 0; i < N; i++) {
			words[i] = br.readLine();
		}
		
		Arrays.sort(words, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				if (s1.length() != s2.length())
					return s1.length()-s2.length();
				return s1.compareTo(s2);
			}
		});
		
		for (int i = 0; i < N; i++) {
			if (i != 0 && words[i].equals(words[i-1]))
				continue;
			System.out.println(words[i]);
		}
	}
}
