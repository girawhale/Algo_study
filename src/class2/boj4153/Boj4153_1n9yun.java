package class2.boj4153;

import java.util.Arrays;
import java.util.Scanner;

public class Boj4153_1n9yun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		
		while(true) {
			for(int i=0;i<3;i++) arr[i] = sc.nextInt();
			if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0) break;
			Arrays.sort(arr);
			System.out.println(arr[2] * arr[2] == (arr[1] * arr[1] + arr[0] * arr[0]) ? "right" : "wrong");
		}
	}
}
