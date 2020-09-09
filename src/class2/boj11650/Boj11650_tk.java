package class2.boj11650;

import java.util.Arrays;
import java.util.Scanner;

public class Boj11650_tk {
	static class Point {
		int y, x;
		
		Point(int y, int x) {
			this.y = y;
			this.x = x;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Point[] arr = new Point[n];
		for(int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			arr[i] = new Point(y, x);
		}
		Arrays.sort(arr, (Point p1, Point p2) -> {
			if(p1.x == p2.x) return p1.y - p2.y;
			else	return p1.x - p2.x;
		});
		for(Point p : arr) 
			System.out.println(p.x + " " + p.y);
	}
}