package class3.boj1992;

import java.util.Scanner;

public class Boj1992_tk {
	static char[][] arr;
	static String ret = "";
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		arr = new char[n][n];
		for(int i = 0; i < n; i++)
			arr[i] = sc.next().toCharArray();
		recur(0, 0, n);
		System.out.println(ret);
	}
	
	public static void recur(int y, int x, int size) {
		boolean one = true, zero = true;
		if(size == 1) {
			ret += arr[y][x];
			return;
		}
		
		for(int i = y; i < y + size; i++) {
			for(int j = x; j < x + size; j++) {
				if(arr[i][j] == '1') zero = false;
				if(arr[i][j] == '0') one = false;
			}
		}
		size /= 2;
		if(one) ret += "1";
		else if(zero) ret+= "0";
		else {
			ret += "(";
			recur(y, x, size);
			recur(y, x + size, size);
			recur(y + size, x, size);
			recur(y + size, x + size, size);
			ret += ")";
		}
	}
}