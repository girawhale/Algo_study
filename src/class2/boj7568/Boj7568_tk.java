package class2.boj7568;

import java.util.Scanner;

public class Boj7568_tk {
	
	static class Human {
		int w, h;
		
		Human(int w, int h) {
			this.w = w;
			this.h = h;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Human[] arr = new Human[n];
		int[] ret = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = new Human(sc.nextInt(), sc.nextInt());
		for(int i = 0; i < n; i++) {
			int cnt = 0;
			for(int j = 0; j < n; j++) {
				if(arr[i].w < arr[j].w && arr[i].h < arr[j].h) {
					cnt++;
				}
			}
			ret[i] = cnt;
		}
		for(int a : ret)
			System.out.print(a + 1 + " ");
	}
}