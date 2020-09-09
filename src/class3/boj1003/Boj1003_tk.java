package class3.boj1003;

import java.util.Scanner;

public class Boj1003_tk {
	static int[] cache;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		cache = new int[42];
		cache[0] = 0;
		cache[1] = 1;
		for(int t = 1; t <= tc; t++) {
			int n = sc.nextInt();
			if(n == 0)
				System.out.println("1 0");
			else 
				System.out.println(fibo(n - 1) + " " + fibo(n));
		}		
	}
	
	public static int fibo(int n) {
		if(n == 0 || n == 1) return cache[n];
		else if(cache[n] == 0)
			cache[n] =  fibo(n - 1) + fibo(n - 2);
		return cache[n];
	}
}