package class2.boj1018;

import java.util.Scanner;

public class Boj1018_이태경 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] map = new String[50];
		int N = sc.nextInt();
		int M = sc.nextInt();
		for(int i = 0; i < N; i++)
			map[i] = sc.next();
		int ret = 64;
		for(int i = 0; i <= N - 8; i++) {
			for(int j = 0; j <= M - 8; j++) {
				int cnt = 0;
				for(int r = 0; r < 8; r++)
					for(int c = 0; c < 8; c++)
						if((r % 2 == c % 2 ? 'W' : 'B') == map[i + r].charAt(j + c))
							cnt++;
				ret = Math.min(ret, cnt);
				ret = Math.min(ret,  64 - cnt);
			}
		}
		System.out.println(ret);
		sc.close();
	}
}
