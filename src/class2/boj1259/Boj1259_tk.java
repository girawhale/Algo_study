package class2.boj1259;

import java.util.Scanner;

public class Boj1259_tk {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		while(!s.equals("0")) {
			boolean chk = true;
			for(int i  = 0; i < s.length() / 2; i++) {
				if(s.charAt(i) != s.charAt(s.length() - i - 1)) {
					chk = false;
					break;
				}
			}
			if(chk) System.out.println("yes");
			else	System.out.println("no");
			s = sc.next();
		}
	}
}