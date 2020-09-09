package class2.boj1436;

import java.util.Scanner;

public class Boj1436_ja {
	/**
	 * 
	 * 종말의 숫자 : 어떤 수에 6이 적어도 3개이상 연속으로 들어가는 수
	 * 666이 포함된 작은 수 부터 순서대로
	 * 7번째, 7666(X) => 6660
	 * 
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int cnt=0;
		for(int i=666; ; i++) {
			if(Integer.toString(i).contains("666"))
				cnt++;
			if(cnt==N) {
				System.out.println(i);
				return;
			}
		}
		
	}

}
