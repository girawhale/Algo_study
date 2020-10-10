package class3.boj2630;

import java.util.Scanner;

public class Boj2630_tk {
	static int[][] board;
	static int n;
	static int[] ret = new int[2];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		board = new int[n][n];
		for(int i = 0; i < n; i++)
			for(int j = 0; j < n; j++)
				board[i][j] = sc.nextInt();
		recur(n, 0, 0);
		System.out.println(ret[0]);
		System.out.println(ret[1]);
	}
	
	public static void recur(int size, int y, int x) {
		if(size == 1) {
			ret[board[y][x]]++;
			return;
		}
		boolean white = true, blue = true;
		for(int i = y; i < y + size; i++) {
			for(int j = x; j < x + size; j++) {
				if(board[i][j] == 0) blue = false;
				if(board[i][j] == 1) white = false;
			}
		}
		size /= 2;
		if(!blue && !white) {
			recur(size, y, x);
			recur(size, y + size, x);
			recur(size, y, x + size);
			recur(size, y + size, x + size);
		}
		else if(blue) {
			ret[1]++;
			return;
		}
		else {
			ret[0]++;
			return;
		}
	}
}