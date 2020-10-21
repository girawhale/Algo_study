package class3.boj11723;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Boj11723_tk {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        Set<Integer> s = new HashSet<>();
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String ins = st.nextToken();
            if(ins.equals("all")) {
                s.clear();
                for(int j = 1; j < 21; j++)
                    s.add(j);
            }
            else if (ins.equals("empty")) {
                s.clear();
            }
            else {
                int n = Integer.parseInt(st.nextToken());
                switch (ins) {
                    case "add":
                        s.add(n);
                        break;
                    case "check":
                        if (s.contains(n)) sb.append("1\n");
                        else sb.append("0\n");
                        break;
                    case "remove":
                        s.remove(n);
                        break;
                    case "toggle":
                        if (s.contains(n))
                            s.remove(n);
                        else
                            s.add(n);
                        break;
                }
            }
        }
        System.out.println(sb.toString());
    }
}