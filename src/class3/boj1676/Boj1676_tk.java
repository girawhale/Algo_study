package class3.boj1676;

import java.util.Scanner;

public class Boj1676_tk {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ret = 0;
		for(int i = 5; i <= n; i*=5)
			ret += n / i;
		System.out.println(ret);
	}
}
