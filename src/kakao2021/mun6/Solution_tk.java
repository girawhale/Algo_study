package kakao2021.mun6;

import java.util.LinkedList;
import java.util.Queue;

public class Solution_tk {
	int answer = 0;
	int cnt = 0;
	int[] dy = {-1, 0, 1, 0};
	int[] dx = {0, 1, 0, -1};
	boolean[][] visited = new boolean[4][4];
	
    public int solution(int[][] board, int r, int c) {
        for(int i = 0; i < 4; i++)
        	for(int j = 0; j < 4; j++)
        		if(board[i][j] != 0) cnt++;
        int card_cnt = 0;
        
        while(card_cnt < cnt) {
        	visited = new boolean[4][4];
        	Queue<Point> q = new LinkedList<>();
        	q.add(new Point(r, c, 0));
        	visited[r][c] = true;
        	while(!q.isEmpty()) {
        		Point cur = q.peek();
        		int memo = -1;
        		if(board[cur.y][cur.x] != 0) {
        			memo = board[cur.y][cur.x];
        			board[cur.y][cur.x] = 0;
//        			q.add(find(board, cur, memo));
        			card_cnt++;
        		}
        		boolean chk = false;
        		loop:
        		for(int d = 0; d < 4; d++) {
        			int ny = cur.y;
        			int nx = cur.x;
        			while(true) {
        				ny += dy[d];
        				nx += dx[d];
        				if(ny < 0 || nx < 0 || ny >= 4 || nx >= 4) continue;
        				if(board[ny][nx] != 0) {
        					q.add(new Point(ny, nx, cur.cnt + 1));
        					chk = true;
        					break loop;
        				}
        			}
        		}
        		if(chk) continue;
        		else {
        			for(int d = 0; d < 4; d++) {
        				int ny = cur.y + dy[d];
        				int nx = cur.x + dx[d];
        				if(ny < 0 || nx < 0 || ny >= 4 || nx >= 4 || visited[ny][nx]) continue;
        				visited[ny][nx] = true;
        				q.add(new Point(ny, nx, cur.cnt + 1));
        			}
        		}
        	}
        }
        return 0;
    }
    
    class Point {
    	int y, x, cnt;
    	
    	Point(int y, int x, int cnt) {
    		this.y = y;
    		this.x = x;
    		this.cnt = cnt;
    	}
    }
}
