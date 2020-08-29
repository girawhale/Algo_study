package class2.boj2751;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Boj2751_sh {
    public static void main(String args[])  {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringBuilder sb = new StringBuilder();
       
       int a;
		try {
			a = Integer.parseInt(br.readLine());
			
			ArrayList<Integer> list = new ArrayList<>();
			
			for(int i=0; i< a; i++) {
				list.add(Integer.parseInt(br.readLine()));
			}
			Collections.sort(list);
			
			for(int b :list) {
				sb.append(b).append('\n');
			}
			System.out.println(sb);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }		
}