package class2.boj11650;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class boj11650_hj {
	
	public static class Pos {
		int x, y;
		
		Pos(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();

		Pos[] points = new Pos[N];

		for (int i = 0; i < N; i++) {
			points[i] = new Pos(sc.nextInt(), sc.nextInt());
		}

		Arrays.sort(points, new Comparator<Pos>() {
			@Override
			public int compare(Pos o1, Pos o2) {
				if (o1.x > o2.x || (o1.x == o2.x && o1.y > o2.y)) {
					return 1;
				} else {
					return -1;
				}
			}
		});

		for (int i = 0; i < N; i++) {
			System.out.println(points[i].x + " " + points[i].y);
		}
	}
}
