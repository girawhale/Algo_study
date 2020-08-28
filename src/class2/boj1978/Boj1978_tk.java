package class2.boj1978;

import java.util.Scanner;

public class Boj1978_tk {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = 1000000;
		boolean[] prime = new boolean[N];
		prime[0] = true;
		prime[1] = true;
		for(int i = 2; i * i < N; i++) 
			if(!prime[i]) 
				for(int j = i * i; j < N; j+=i) 
					prime[j] = true;
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
		int cnt = 0;
		for(int i : arr)
			if(!prime[i])
				cnt++;
		System.out.println(cnt);
	}
}
