package class2.boj4153;

import java.util.Scanner;

public class boj4153_hj {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int[] nums = new int[3];
            int maxidx = 0;

            for (int i = 0; i < 3; i++) {
                nums[i] = sc.nextInt();
                if (nums[i] > nums[maxidx])
                    maxidx = i;
            }

            if (nums[0] == 0 && nums[1] == 0 && nums[2] == 0)
                break;

            int sum = 0;

            for (int i = 0; i < 3; i++) {
                nums[i] = nums[i] * nums[i];
                if (i != maxidx)
                    sum += nums[i];
            }

            System.out.println(sum == nums[maxidx] ? "right" : "wrong");

        }
    }
}
