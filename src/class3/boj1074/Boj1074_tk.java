package class3.boj1074;

import java.util.Scanner;

public class Boj1074_tk {
	static int N, r, c;
	static int ret = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		r = sc.nextInt();
		c = sc.nextInt();
		int tmp = (int)Math.pow(2, N);
		recur(0, 0, tmp);
	}
	
	public static void recur(int y, int x, int cur) {
		int range = cur / 2;
		if(y == r && x == c) { 
			System.out.println(ret);
			return;
		}
		
		if(r >= y  && r < y + cur && c >= x && c < x + cur) {
			recur(y, x, range);
			recur(y, x + range, range);
			recur(y + range, x, range);
			recur(y + range, x + range, range);
		}
		else {
			ret += (cur * cur);
		}
	}
}