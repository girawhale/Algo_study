package class3.boj9019;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Boj9019_tk {
	static class Node {
		int n;
		String ret;
		
		public Node(int n, String ret) {
			this.n = n;
			this.ret = ret;
		}
	}
	static boolean[] visited;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			visited = new boolean[10000];
			System.out.println(bfs(a, b));
		}
	}
	
	public static String bfs(int a, int b) {
		Queue<Node> q = new LinkedList<>();
		q.add(new Node(a, ""));
		visited[a] = true;
		while(!q.isEmpty()) {
			Node cur = q.poll();
			if(cur.n == b)
				return cur.ret;
			int d = D(cur.n);
			int s = S(cur.n);
			int l = L(cur.n);
			int r = R(cur.n);
			if(!visited[d]) {
				visited[d] = true;
				q.add(new Node(d, cur.ret + "D"));
			}
			if(!visited[s]) {
				visited[s] = true;
				q.add(new Node(s, cur.ret + "S"));
			}
			if(!visited[l]) {
				visited[l] = true;
				q.add(new Node(l, cur.ret + "L"));
			}
			if(!visited[r]) {
				visited[r] = true;
				q.add(new Node(r, cur.ret + "R"));
			}
		}
		return "";
	}
	
	
	public static int D(int number) {
		return (number * 2) % 10000;
	}
	
	public static int S(int number) {
		return number == 0 ? 9999 : number - 1;
	}
	
	public static int L(int number) {
		return ((number % 1000) * 10) + (number / 1000);
	}
	
	public static int R(int number) {
		return ((number % 10) * 1000) + (number / 10);
	}
}