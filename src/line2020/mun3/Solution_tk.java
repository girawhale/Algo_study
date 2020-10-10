package line2020.mun3;

public class Solution_tk {
	static int ret_cnt = 10000;
	static int ret_num = 0;
	
    public int[] solution(int n) {
        String str = String.valueOf(n);
        recur(str, 0);
        int[] answer = {ret_cnt, ret_num};
        return answer;
    }
    
    public void recur(String str, int cnt) {
    	if(str.length() == 1) {
    		if(cnt < ret_cnt) {
    			ret_cnt = cnt;
    			ret_num = Integer.valueOf(str);
    		}
    		return;
    	}
    	
    	for(int i = 1; i < str.length(); i++) {
    		if(str.substring(i).length() != 1 && str.substring(i).charAt(0) == '0') continue;
    		int a = Integer.valueOf(str.substring(0, i));
    		int b = Integer.valueOf(str.substring(i));
    		String s = String.valueOf(a + b);
    		recur(s, cnt + 1);
    	}
    }   
}