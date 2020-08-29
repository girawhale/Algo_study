package class2.boj10250;

import java.util.Scanner;

public class Boj10250 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int t = 1; t <= tc; t++) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			int n = sc.nextInt();
			String str = "";
			int cnt = 0;
			for(int i = 1; i <= w; i++) {
				for(int j = 1; j <= h; j++) {
					cnt++;
					if(cnt == n) {
						str += j;
						if(i < 10) str += 0;
						str += i;
					}
				}
			}
			System.out.println(str);
		}
	}
}
