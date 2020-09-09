package class2.boj11866;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Boj11866_tk {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		Queue<Integer> q = new LinkedList<>();
		for(int i = 1; i <= n; i++)
			q.add(i);
		int cnt = 1;
		System.out.print("<");
		while(q.size() > 1) {
			if(cnt == k) { 
				System.out.print(q.poll() + ", ");
				cnt = 1;
				continue;
			}
			q.add(q.poll());
			cnt++;
		}
		System.out.print(q.poll() + ">");
	}
}