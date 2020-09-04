package class2.boj1018;

import java.util.Scanner;

public class Boj1018_ja {
	/**
	 * 
	 * M*N 크기의 보드
	 * 검은색 / 흰색
	 * 보드 잘라서 8*8 크기의 체스판 만들기
	 * 체스판 - 검은색 흰색 번갈아서 칠해져야함 -> 변을 공유하는 두 개의 사각형은 다른 색으로 칠해여 있어야 함
	 * 두가지 경우 밖에 안 나옴 - 흰/검 시작
	 * 
	 * 보드는 체스판처럼 칠해져 있지 X
	 * 체스판 크기로 잘라낸 후, 몇 개의 정사각형을 다시 칠할거야.
	 * 다시 칠해야하는 정사각형의 최소 개수는?
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		// B = true , W = false
		boolean[][] data = new boolean[N][M];
		for (int i = 0; i < N; i++) {
			String str = in.next();
			for (int j = 0; j < M; j++) {
				data[i][j] = str.charAt(j) == 'B';
			}
		}
		// 시작이 B일 때, 가로만 일단 따져보면. 만들 수 있는 체스판 경우들의 다시 칠해야하는 횟수의 총합을 배열로 저장
		int[][] changeB = new int[N][M-8+1];
		// 시작이 W일 때, 위와 동일
		int[][] changeW = new int[N][M-8+1];
		
		boolean startB = true;
		for (int i = 0; i < N; i++) {
			for (int m = 0; m <= (M - 8); m++) {
				int sumB = 0, sumW = 0;
				for (int j = m; j < m+8; j++) {
					if(data[i][j]==startB)
						sumW+=1;
					else 
						sumB+=1; 
					startB = !startB;
				}
				changeB[i][m]=sumB;
				changeW[i][m]=sumW;
			}
			startB = !startB;
		}
		
		// 이번에는 세로
		int min = Integer.MAX_VALUE;
		for (int j = 0; j <= (M - 8); j++) {
			for (int n = 0; n <= (N - 8); n++) {
				int sumB =0, sumW=0;
				for (int i = n; i < n + 8; i++) {
					sumB+=changeB[i][j];
					sumW+=changeW[i][j];
				}
				if(min>sumB) min = sumB;
				if(min>sumW) min = sumW;
			}
		}
		System.out.println(min);
	}

}
