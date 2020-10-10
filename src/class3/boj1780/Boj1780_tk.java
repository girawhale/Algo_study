package class3.boj1780;

import java.util.Scanner;

public class Boj1780_tk {
	static int[] ret = new int[3];
	static int[][] board;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		board = new int[n][n];
		for(int i = 0; i < n; i++)
			for(int j = 0; j < n; j++)
				board[i][j] = sc.nextInt();
		recur(0, 0, n);
		for(int a : ret)
			System.out.println(a);
	}
	
	public static void recur(int y, int x, int size) {
		int num = board[y][x];
		boolean chk = true;
		loop:
		for(int i = y; i < y + size; i++)
			for(int j = x; j < x + size; j++)
				if(board[i][j] != num) {
					chk = false;
					break loop;
				}
		if(chk) {
			ret[num + 1]++;
			return;
		}
		
		size /= 3;
		for(int i = 0; i < 3; i++)
			for(int j = 0; j < 3; j++)
				recur(y + i * size, x + j * size, size); 
	}
}