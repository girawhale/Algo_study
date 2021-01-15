package class4.boj1043;

import java.util.Scanner;

public class Boj1043_tk {
    static int[] parents, know;
    static int N, M, t;
    static int[][] man;

    static int findSet(int x) {
        if(parents[x] == x) return x;
        else {
            parents[x] = findSet(parents[x]);
            return parents[x];
        }
    }

    static void union(int x, int y) {
        parents[findSet(x)] = findSet(y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        t = sc.nextInt();
        man = new int[51][51];
        parents = new int[51];
        know = new int[t];
        for(int i = 1; i <= 50; i++)
            parents[i] = i;

        for(int i = 0; i < t; i++)
            know[i] = sc.nextInt();

        for(int i = 0; i < M; i++) {
            man[i][0] = sc.nextInt();
            for(int j = 1; j <= man[i][0]; j++) {
                man[i][j] = sc.nextInt();
                union(man[i][1], man[i][j]);
            }
        }

        int ret = 0;
        for(int i = 0; i < M; i++) {
            boolean chk = true;
            loop:
            for(int r = 1; r <= man[i][0]; r++)
                for(int j = 0; j < t; j++)
                    if(findSet(man[i][r]) == findSet(know[j])) {
                        chk = false;
                        break loop;
                    }
            if(chk) ret++;
        }
        System.out.println(ret);
    }
}