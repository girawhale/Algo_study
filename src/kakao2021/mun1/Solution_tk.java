package kakao2021.mun1;

public class Solution_tk {
    public String solution(String new_id) {

    	String answer = "";
    	String tmp = new_id.toLowerCase();
    	for(int i = 0; i < tmp.length(); i++) {
    		char c = tmp.charAt(i);
    		if((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == '-' || c == '_' || c == '.') {
    			answer += c;
    			continue;
    		}
    	}
    	
    	while(answer.contains(".."))
    		answer = answer.replace("..", ".");
    	
    	if(answer.equals(".")) {
    		return "aaa";
    	}
    	if(answer.length() != 0 && answer.charAt(0) == '.') answer = answer.substring(1);
    	if(answer.length() != 0 && answer.charAt(answer.length() - 1) == '.')  {
    		answer = answer.substring(0, answer.length() - 1);
    	}

    	if(answer == "") answer = "a";
    	if(answer.length() >= 16)
    		answer = answer.substring(0, 15);
    	if(answer.length() != 0 && answer.charAt(answer.length() - 1) == '.')  answer = answer.substring(0, answer.length() - 1);
    	
    	if(answer.length() <= 2)
    		while(answer.length() < 3)
    			answer += answer.charAt(answer.length() - 1);
    	
        return answer;
    }
    
    public static void main(String[] args) {
		System.out.println(new Solution_tk().solution("=.="));
	}
}