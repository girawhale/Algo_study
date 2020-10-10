package class3.boj5430;

import java.util.Scanner;

public class boj5430_tk {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int t = 1; t <= tc; t++) {
			StringBuilder sb = new StringBuilder();
			String func = sc.next();
			int n = sc.nextInt();
			int f = 0, b = n - 1;
			boolean chk = true;
			String s = sc.next();
			String[] arr = s.substring(1, s.length() - 1).split(",");
			for(int i = 0; i < func.length(); i++) {
				if(func.charAt(i) == 'R') chk = !chk;
				else {
					if(chk) f++;
					else b--;
				}
			}
			if(f - b > 1) {
				sb.append("error");
				System.out.println(sb);
				continue;
			}
			sb.append("[");
			if(chk) 
				for(int i = f; i <= b; i++) sb.append(arr[i]).append(",");
			else
				for(int i = b; i >= f; i--) sb.append(arr[i]).append(",");
			if(f - b != 1)
				sb.delete(sb.length() - 1, sb.length());
			sb.append("]");
			System.out.println(sb);
		}
	}
}