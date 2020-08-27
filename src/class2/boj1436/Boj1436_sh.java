package class2.boj1436;

import java.util.Scanner;

public class Boj1436_sh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int cnt = 0, num = 0;
		while (N > cnt) {
			num++;
			if (Integer.toString(num).contains("666"))
				cnt++;
		}
		System.out.println(num);
	}

}
