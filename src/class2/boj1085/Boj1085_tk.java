package class2.boj1085;

import java.util.Scanner;

public class Boj1085_tk {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[4];
		for(int i = 0; i < 4; i++)
			arr[i] = sc.nextInt();
		System.out.println(Math.min(arr[0], Math.min(arr[2] - arr[0], Math.min(arr[1], arr[3] - arr[1]))));
	}
}
