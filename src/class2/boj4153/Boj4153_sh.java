package class2.boj4153;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Boj4153_sh {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();
		while (true) {
			String input = br.readLine();
			if (input.equals("0 0 0"))
				break;

			int[] arr = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
			Arrays.sort(arr);

			sb.append(arr[0] * arr[0] + arr[1] * arr[1] == arr[2] * arr[2] ? "right" : "wrong").append('\n');
		}

		System.out.println(sb.toString());
	}
}
