package class2.boj1874;

import java.util.Scanner;
import java.util.Stack;

public class Boj1874_ja {
	
	/**
	 * 1부터 n까지의 수를 스택에 push, pop
	 * 스택에 push하는 순서는 반드시 오름차순
	 * 
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] data = new int[N];
		for(int i=0; i<N; i++) 
			data[i]=in.nextInt();
		
		Stack<Integer> stack = new Stack<>();
		int num = 1, point = 0;
		StringBuffer result = new StringBuffer();
		
		while(num!=N+2) {
			if(!stack.isEmpty() && stack.peek() == data[point]) {
				stack.pop();
				result.append("-\n");
				point++;
				if(point==N) {
					System.out.println(result.toString());
					return;
				}
			}
			else {
				stack.push(num++);
				result.append("+\n");
			}
		}
		System.out.println("NO");
	}

}
