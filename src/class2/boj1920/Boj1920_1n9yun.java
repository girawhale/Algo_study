package class2.boj1920;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj1920_1n9yun {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		for(int i=0;i<m;i++) {
			char ans = '0';
			int left = 0;
			int right = arr.length - 1;
			int target = Integer.parseInt(st.nextToken());
			
			while(left <= right) {
				int mid = (left + right) / 2;
				
				if(arr[mid] > target) right = mid - 1;
				else if(arr[mid] < target) left = mid + 1;
				else {
					ans = '1';
					break;
				}
			}
			bw.write(ans + "\n");
		}
		bw.flush();
	}
}
