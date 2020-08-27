package class2.boj1259;

import java.util.Scanner;

public class Boj1259_sh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			String input = sc.next();
			if (input.equals("0"))
				break;

			int n = 0;
			boolean ck = true;
			while (ck && n < input.length() / 2) {
				if (input.charAt(n) != input.charAt(input.length() - n - 1))
					ck = false;
				n++;
			}
			System.out.println(ck ? "yes" : "no");
		}
	}
}
