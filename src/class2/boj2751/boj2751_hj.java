package class2.boj2751;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class boj2751_hj {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < N; i++)
			list.add(Integer.parseInt(br.readLine()));

		list.sort(null);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int i = 0; i < list.size(); i++) {
			bw.write(list.get(i)+"\n");
		}
		bw.flush();
	}

}
