package line2020.mun4;

public class Solution_tk {
	static int[] dy = {-1, 0, 1, 0};
	static int[] dx = {0, -1, 0, 1};
	static int[][] map;
	static int n;
	
    public int solution(int[][] maze) {
        map = maze;
        n = maze.length;
        miro(new Point(0, 0));
        return 0;
    }
    
    
    public void miro(Point start) {
    	int direction = 0;
//    	direction = nextDirection(start.y, start.x, direction);
    	int cury = start.y;
    	int curx = start.x;
    	
    	while(true) {
    		int ny = cury + dy[direction];
    		int nx = curx + dx[direction];
    		
    		if(ny == n - 1 && nx == n - 1) return;
    		if(ny >= 0 && nx >= 0 && ny < n && nx < n) {
    			if(map[ny][nx] == 1) {
//    				direction = nextDirection(cury, curx, direction);
    				continue;
    			}
    			
    			cury = ny;
    			curx = nx;
    		}
    	}
    }
    
    
    
    
    class Point {
    	int y, x;
    	
    	public Point(int y, int x) {
    		this.y = y;
    		this.x = x;
    	}
    }
}