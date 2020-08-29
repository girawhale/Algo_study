package class2.boj2839;

import java.util.Scanner;

public class Boj2839_tk {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ret = n + 1;
		for(int i = 0; i * 3 <= n; i++)
			if((n - 3 * i) % 5 == 0)
				ret = Math.min(ret, i + (n - i * 3) / 5);
		if(ret == n + 1)
			ret = -1;
		System.out.println(ret);
	}
}