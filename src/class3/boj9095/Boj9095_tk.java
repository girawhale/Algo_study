package class3.boj9095;

import java.util.Scanner;

public class Boj9095_tk {
	static int[] cache = new int[11];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		cache[1] = 1;
		cache[2] = 2;
		cache[3] = 4;
		for(int i = 4; i < 11; i++)
			cache[i] = cache[i - 1] + cache[i - 2] + cache[i - 3];
		
		for(int t = 1; t <= tc; t++)
			System.out.println(cache[sc.nextInt()]);
	}
}