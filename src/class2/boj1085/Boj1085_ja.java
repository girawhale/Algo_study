package class2.boj1085;

import java.util.Scanner;

public class Boj1085_ja{
	/**
	 * 한수(x,y) 
	 * 작사각형 왼쪽 아래 꼭짓점 (0,0) 
	 * 오른쪽 위 꼭짓점 (w,h) 
	 * result : 직사각형의 경계선까지 가는 거리의 최솟값
	 */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] hansu = { in.nextInt(), in.nextInt() };
		int[] rectangle = { in.nextInt(), in.nextInt() };

		int result = Math.min(Math.min(hansu[0], rectangle[0] - hansu[0]), Math.min(hansu[1], rectangle[1] - hansu[1]));
		System.out.println(result);

	}

}
