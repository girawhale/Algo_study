package class3.boj9019;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Boj9019_sh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int A = sc.nextInt(), B = sc.nextInt();
			boolean[] visit = new boolean[10001];
			visit[Integer.valueOf(A)] = true;

			Queue<Register> que = new LinkedList<>();
			que.add(new Register(A, ""));

			String ans = "";
			while (!que.isEmpty()) {
				Register cur = que.poll();

				if (cur.num == B) {
					System.out.println(cur.command);
					break;
				}

				if (!visit[cur.D()]) {
					que.add(new Register(cur.D(), cur.command + "D"));
					visit[cur.D()] = true;
				}
				if (!visit[cur.S()]) {
					que.add(new Register(cur.S(), cur.command + "S"));
					visit[cur.S()] = true;
				}
				if (!visit[cur.L()]) {
					que.add(new Register(cur.L(), cur.command + "L"));
					visit[cur.L()] = true;
				}
				if (!visit[cur.R()]) {
					que.add(new Register(cur.R(), cur.command + "R"));
					visit[cur.R()] = true;
				}

			}
		}

	}

	static class Register {
		int num;
		String command;

		Register(int num, String command) {
			this.num = num;
			this.command = command;
		}

		int D() {
			return (num * 2) % 10000;
		}

		int S() {
			return num == 0 ? 9999 : num - 1;
		}

		int L() {
			return num % 1000 * 10 + num / 1000;
		}

		int R() {
			return num % 10 * 1000 + num / 10;
		}
	}
}
