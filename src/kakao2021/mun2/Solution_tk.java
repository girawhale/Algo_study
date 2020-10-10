package kakao2021.mun2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Solution_tk {
	HashMap<String, Integer> map = new HashMap<>();
    public String[] solution(String[] orders, int[] course) {
       
        char[][] order = new char[orders.length][];
        for(int i = 0; i < orders.length; i++) {
        	order[i] = orders[i].toCharArray();
        	Arrays.sort(order[i]);
        }
        
        for(int i = 0; i < orders.length; i++) 
        	for(int j = 0; j < course.length; j++)
        		add("", order[i], 0, 0, course[j]);
        
        ArrayList<String> ret = new ArrayList<>();
        for(int i = 0; i < course.length; i++) {
        	int max = 0;
        	String str = "";
			for (HashMap.Entry<String, Integer> entry : map.entrySet()) {
				if(entry.getKey().length() == course[i]) {
					if(entry.getValue() >= 2 && entry.getValue() > max) {
						max = entry.getValue();
					}
				}
			}
			for (HashMap.Entry<String, Integer> entry : map.entrySet()) {
				if(entry.getKey().length() == course[i]) {
					if(entry.getValue() >= 2 && entry.getValue() == max) {
						str = entry.getKey();
						if(str.length() >= 2)
							ret.add(str);
					}
				}
			}
		}
        String[] answer = ret.toArray(new String[ret.size()]);
        Arrays.sort(answer);
        return answer;
    }
    
    public void add(String ret, char[] order, int idx, int cnt, int num) {
    	if(cnt == num) {
    		if(ret.length() != 0 && map.containsKey(ret)) {
    			int val = map.get(ret);
    			map.put(ret, val + 1);
    		}
    		else
    			map.put(ret, 1);
    		return;
    	}
    	
    	if(idx >= order.length) return;
    	
    	add(ret + order[idx], order, idx + 1, cnt + 1, num);
    	add(ret, order, idx + 1, cnt, num);
    }

}
