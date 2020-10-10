package kakao2021.mun3;


public class Solution_tk {
    public int[] solution(String[] info, String[] query) {
    	int[] answer = new int[query.length];
        
        Condition[] info_arr = new Condition[info.length];
        Condition[] query_arr = new Condition[query.length];
        
        for(int i = 0; i < info.length; i++) {
        	String str = info[i];
        	String[] str_arr = str.split(" ");
        	info_arr[i] = new Condition(str_arr[0], str_arr[1], str_arr[2], str_arr[3], Integer.valueOf(str_arr[4]));
        }
        
        for(int j = 0; j < query.length; j++) {
        	String str = query[j];
        	String[] arr = str.split("and");
        	String[] sub = new String[2];
        	for(int i = 0; i < 4; i++) {
        		arr[i] = arr[i].trim();
        		if(i == 3) {
        			sub = arr[i].split(" ");
        		}
        	}
        	query_arr[j] = new Condition(arr[0], arr[1], arr[2], sub[0], Integer.valueOf(sub[1])); 
        }
        
        for(int i = 0; i < query.length; i++) {
        	Condition cur = query_arr[i];
        	int cnt = 0;
        	for(int j = 0; j < info.length; j++) {
        		if(!cur.a.equals(info_arr[j].a) && !cur.a.equals("-")) continue;
        		if(!cur.b.equals(info_arr[j].b) && !cur.b.equals("-")) continue;
        		if(!cur.c.equals(info_arr[j].c) && !cur.c.equals("-")) continue;
        		if(!cur.d.equals(info_arr[j].d) && !cur.d.equals("-")) continue;
        		if(info_arr[j].e >= cur.e) cnt++;
        	}
        	answer[i] = cnt;
        }
        return answer;
    }
    
    class Condition {
    	String a, b, c, d;
    	int e;
    	
    	Condition(String a, String b, String c, String d, int e) {
    		this.a = a;
    		this.b = b;
    		this.c = c;
    		this.d = d;
    		this.e = e;
    	}
    }
    
}