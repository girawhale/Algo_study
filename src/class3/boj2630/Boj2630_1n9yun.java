package class3.boj2630;

import java.util.Scanner;

public class Boj2630_1n9yun {
    static class Pair{
        int left, right;

        public Pair(int left, int right) {
            this.left = left;
            this.right = right;
        }
    }
    static int white = 0;
    static int blue = 0;
    static int[][] partialSumPaper;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        partialSumPaper = new int[n+1][n+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                partialSumPaper[i][j] = sc.nextInt() + partialSumPaper[i-1][j] + partialSumPaper[i][j-1] - partialSumPaper[i-1][j-1];
            }
        }

        divide(new Pair(1, 1), new Pair(n, n));
        System.out.println(white);
        System.out.println(blue);
    }

    static void divide(Pair leftTop, Pair rightBottom){
        int sum = partialSumPaper[rightBottom.left][rightBottom.right]
                - partialSumPaper[rightBottom.left][leftTop.right - 1]
                - partialSumPaper[leftTop.left - 1][rightBottom.right]
                + partialSumPaper[leftTop.left - 1][leftTop.right - 1];

        if(sum == 0) white++;
        else if(sum == (rightBottom.left - leftTop.left + 1) * (rightBottom.right - leftTop.right + 1)) blue++;
        else{
            Pair firstRightBottom = new Pair((leftTop.left + rightBottom.left) / 2, (leftTop.right + rightBottom.right) / 2);
            divide(leftTop, firstRightBottom);
            divide(new Pair(leftTop.left, firstRightBottom.right + 1), new Pair(firstRightBottom.left, rightBottom.right));
            divide(new Pair(firstRightBottom.left + 1, leftTop.right), new Pair(rightBottom.left, firstRightBottom.right));
            divide(new Pair(firstRightBottom.left + 1, firstRightBottom.right + 1), rightBottom);
        }
    }
}
