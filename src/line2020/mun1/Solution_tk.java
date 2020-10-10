package line2020.mun1;

public class Solution_tk {
    public int solution(int[][] boxes) {
        int[] count = new int[1000001];
        for(int i = 0; i < boxes.length; i++) {
        	count[boxes[i][0]]++;
        	count[boxes[i][1]]++;
        }
        int cnt = boxes.length;
        for(int i = 0; i < count.length; i++)
        	while(count[i] >= 2) {
        		cnt--;
        		count[i] -= 2;
        	}
        return cnt;
    }
}