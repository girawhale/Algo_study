package class3.boj1107;

import java.util.Scanner;

public class Boj1107_tk {
	static int n, m, ret;
	static boolean[] chk;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		chk = new boolean[10];
		for(int i = 0; i < m; i++)
			chk[sc.nextInt()] = true;
		ret = (int)Math.abs(n - 100);
		dfs("");
		System.out.println(ret);
	}
	
	public static void dfs(String str) {
		if(str.length() == 6) return;
		
		for(int i = 0; i < 10; i++) {
			if(!chk[i]) {
				String next = str + i;
				ret = Math.min(ret,  Math.abs(Integer.valueOf(next) - n) + next.length());
				dfs(next);
			}
		}
	}
}
