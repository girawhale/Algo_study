package class2.boj1920;

import java.util.Arrays;
import java.util.Scanner;

public class Boj1920_tk {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
		Arrays.sort(arr);
		int m = sc.nextInt();
		for(int i = 0; i < m; i++) {
			if(Arrays.binarySearch(arr, sc.nextInt()) >= 0) System.out.println(1);
			else	System.out.println(0);
		}
	}
}