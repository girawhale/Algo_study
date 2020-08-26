package class2.boj1259;

import java.util.Scanner;

public class Boj1259_1n9yun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		while(!input.equals("0")) {
			String ans = "yes";
			for(int i=0;i<input.length()/2;i++) {
				if(input.charAt(i) != input.charAt(input.length() - 1 - i)) {
					ans = "no";
					break;
				}
			}
			System.out.println(ans);
			
			input = sc.next();
		}
	}
}

