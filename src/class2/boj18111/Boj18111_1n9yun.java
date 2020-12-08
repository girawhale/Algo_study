package class2.boj18111;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj18111_1n9yun {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[][] map = new int[n][m];
        int sum = 0;
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++){
                map[i][j] = Integer.parseInt(st.nextToken());
                sum += map[i][j];
            }
        }

        int ans = Integer.MAX_VALUE;
        int ansHeight = 0;
        for(int height=256; height>=0; height--){
            if(sum + b < height * n * m) continue;
            int time = 0;
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(map[i][j] == height) continue;
                    else if(map[i][j] > height) time += ((map[i][j] - height) * 2);
                    else time += (height - map[i][j]);
                }
            }
            if(time < ans){
                ans = time;
                ansHeight = height;
            }
        }

        System.out.println(ans + " " + ansHeight);
    }
}
