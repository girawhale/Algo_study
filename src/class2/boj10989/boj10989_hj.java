package class2.boj10989;

import java.io.*;

public class boj10989_hj {
    /*
    * Countingsort Hint
    * - 천만짜리 int배열 = 1000만*4/(1024)^2 = 약 38MB (1KB = 1024B, 1MB = 1024KB)
    * - 메모리 제한 8MB => N개의 수를 다 저장할 수 없다 => 수가 10000보다 작거나 같대 => 카운팅 정렬
    * - 근데 왜 java8dms 512MB를 줄까... 는 의문
    * */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[10001];

        for (int i = 0; i < N; i++)
            arr[Integer.parseInt(br.readLine())]++;

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                for (int j = 0; j < arr[i]; j++)
                    bw.write(i+"\n");
            }
        }
        bw.flush();
    }
}
