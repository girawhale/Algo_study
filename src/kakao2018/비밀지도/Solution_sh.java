package kakao2018.비밀지도;

public class Solution_sh {
	public String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];

		for (int i = 0; i < n; i++) {
			answer[i] = Integer.toBinaryString((arr1[i] | arr2[i]) | 1 << n).substring(1, n + 1).replace('1', '#')
					.replace('0', ' ');
		}

		return answer;
	}
}
