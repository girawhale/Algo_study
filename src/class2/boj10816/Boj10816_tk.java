package class2.boj10816;

import java.util.Scanner;

public class Boj10816_tk {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[20000001];
		for(int i = 0; i < N; i++)
			arr[sc.nextInt() + 10000000]++;
		int M = sc.nextInt();
		for(int i = 0; i < M; i++)
			System.out.print(arr[sc.nextInt() + 10000000] + " ");
	}
}
