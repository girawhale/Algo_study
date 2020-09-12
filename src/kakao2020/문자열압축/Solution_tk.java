package kakao2020.문자열압축;

public class Solution_tk {
    public int solution(String s) {
    	int ret = s.length();
    	for(int i = 1; i <= s.length() / 2; i++) {
    		String prev = "";
    		int cnt = 1;
    		int tmp = 0;
    		for(int j = 0; j < s.length(); j += i) {
    			String next = "";
    			if(j + i >= s.length()) {
    				next = s.substring(j);
    			}
    			else {
    				next = s.substring(j, j + i);
    			}
    			
    			if(prev.equals(next)) {
    				cnt++;
    			}
    			else {
    				tmp += next.length();
    				if(cnt > 1 && cnt < 10) tmp++;
    				else if(cnt >= 10 && cnt < 100) tmp += 2;
    				prev = next;
    				cnt = 1;
    			}	
    		}
    		if(cnt > 1 && cnt < 10) tmp++;
    		else if(cnt >= 10 && cnt < 100)  tmp += 2;
    		ret = Math.min(tmp, ret);
    	}
    	return ret;
    }
}