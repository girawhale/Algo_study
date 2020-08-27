package class2.boj1181;

import java.util.Arrays;
import java.util.Scanner;

public class Boj1181_tk {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] arr = new String[N];
		for(int i = 0; i < N; i++)
			arr[i] = sc.next();
		Arrays.sort(arr, (String s1, String s2) -> s1.length() == s2.length() ? s1.compareTo(s2) : s1.length() - s2.length());
		for(int i = 0; i < N; i++)
			if(i == 0 || !arr[i].equals(arr[i - 1]))
				System.out.println(arr[i]);
	}
}