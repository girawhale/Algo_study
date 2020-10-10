package class3.boj1931;

import java.util.*;

public class Boj1931_tk {
	static class Meeting implements Comparable<Meeting> {
		int start, end;
		
		Meeting(int start, int end) {
			this.start = start;
			this.end = end;
		}

		@Override
		public int compareTo(Meeting o) {
			if(this.end == o.end) return this.start - o.start;
			return this.end - o.end;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Meeting[] arr = new Meeting[n];
		for(int i = 0; i < n; i++)
			arr[i] = new Meeting(sc.nextInt(), sc.nextInt());
		Arrays.sort(arr);
		int cnt = 1;
		int end= arr[0].end;
		for(int i = 1; i < n; i++) {
			if(end <= arr[i].start) {
				end = arr[i].end;
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}