package class2.boj1259;

import java.util.Scanner;

public class Boj1259_ja {
	/**
	 * 
	 * 팬린드롬 : 뒤에서 부터 읽어도 같은 숫자
	 * 
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true) {
			String num = in.next();
			
			if(num.equals("0"))return;
			boolean check = true;
			for(int i=0; i<num.length()/2; i++) {
				if(num.charAt(i)!=num.charAt(num.length()-i-1)) {
					System.out.println("no");
					check=false;
					break;
				}
			}
			if(check)System.out.println("yes");
		}
	}

}
