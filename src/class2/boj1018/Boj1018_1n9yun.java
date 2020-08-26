package class2.boj1018;

import java.util.Scanner;

public class Boj1018_1n9yun {
	static String[][] frame = {
			{
				"BWBWBWBW",
				"WBWBWBWB",
				"BWBWBWBW",
				"WBWBWBWB",
				"BWBWBWBW",
				"WBWBWBWB",
				"BWBWBWBW",
				"WBWBWBWB"
			},
			{
				"WBWBWBWB",
				"BWBWBWBW",
				"WBWBWBWB",
				"BWBWBWBW",
				"WBWBWBWB",
				"BWBWBWBW",
				"WBWBWBWB",
				"BWBWBWBW"
			}
	};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		String[] inputs = new String[n];
		
		for(int i=0;i<n;i++) {
			inputs[i] = sc.next();
		}
		
		int ans = (1 << 31) - 1;
		
		for(int i=0;i<n-7;i++) {
			for(int j=0;j<m-7;j++) {
				for(int k=0;k<2;k++) {
					
					int count = 0;
					for(int l=0;l<8;l++) {
						count += diffCountOfStrings(frame[k][l], inputs[i + l].substring(j, j + 8));
					}
					ans = Math.min(ans, count);
					
				}
			}
		}
		System.out.println(ans);
	}
	
	static int diffCountOfStrings(String s1, String s2) {
		int res = 0;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i) != s2.charAt(i)) res++;
		}
		return res;
	}
}
