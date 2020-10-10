package line2020.mun2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class Solution_tk {
    public Integer[] solution(int[] ball, int[] order) {
        Deque<Integer> deq = new ArrayDeque<>();
        for(int i = 0; i < ball.length; i++)
        	deq.add(ball[i]);
        ArrayList<Integer> pri = new ArrayList<>();
        ArrayList<Integer> ret = new ArrayList<>();
        int cnt = 0;
        int idx = 0;
        while(cnt < ball.length) {
        	while(true) {
        		boolean chk = false;
				for(int i = 0; i < pri.size(); i++) {
					if(deq.peekFirst() == pri.get(i)) {
						ret.add(deq.pollFirst());
						cnt++;
						pri.set(i, 0);
						chk = true;
					}
					else if(deq.peekLast() == pri.get(i)) {
						ret.add(deq.pollLast());
						cnt++;
						pri.set(i, 0);
						chk = true;
					}
				}
				if(!chk) break;
        	}
        	
        	if(cnt == ball.length) break;
        	
        	if(deq.peekFirst() == order[idx]) {
        		ret.add(deq.pollFirst());
        		cnt++;
        	}
        	else if(deq.peekLast() == order[idx]) {
        		ret.add(deq.pollLast());
        		cnt++;
        	}
        	else {
        		pri.add(order[idx]);
        	}
        	idx++;
        }
        Integer[] answer = ret.toArray(new Integer[ret.size()]);
        return answer;
    }
}
