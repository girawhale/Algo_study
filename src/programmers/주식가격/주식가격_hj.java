package programmers.주식가격;

import java.util.Arrays;
import java.util.PriorityQueue;

public class 주식가격_hj {

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] result = sol.solution(new int[]{1, 2, 3, 2, 3});
        System.out.println(Arrays.toString(result));
    }

    static class stock implements Comparable<stock> {
        int idx, price;

        stock(int idx, int price) {
            this.idx = idx;
            this.price = price;
        }

        @Override
        public int compareTo(stock o) {
            // price가 클 때 우선순위를 높이기 위해 (양수일 때 자리 변경됨)
            return this.price <= o.price ? 1 : -1;
        }
    }

    static class Solution {
        public int[] solution(int[] prices) {
            int[] answer = new int[prices.length];

            PriorityQueue<stock> pq = new PriorityQueue<>();
            for (int i = 0; i < prices.length; i++) {
                while (!pq.isEmpty() && pq.peek().price > prices[i]) {
                    answer[pq.peek().idx] = i-pq.peek().idx;
                    pq.poll();
                }
                pq.add(new stock(i, prices[i]));
            }

            while (!pq.isEmpty()) {
                answer[pq.peek().idx] = prices.length-pq.peek().idx-1;
                pq.poll();
            }

            return answer;
        }
    }

}
