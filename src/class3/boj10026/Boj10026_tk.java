package class3.boj10026;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Boj10026_tk {
    static class Point {
        int y, x;

        public Point(int y, int x) {
            this.y = y;
            this.x = x;
        }
    }
    static final int[] dy = {-1, 0, 1, 0}, dx = {0, 1, 0, -1};
    static int N;
    static char[][] board;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        board = new char[N][N];
        visited = new boolean[N][N];
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            board[i] = st.nextToken().toCharArray();
        }
        int ret1 = 0, ret2 = 0;
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(visited[i][j]) continue;
                visited[i][j] = true;
                bfs(new Point(i, j));
                ret1++;
            }
        }
        visited = new boolean[N][N];
        for(int i = 0; i < N; i++)
            for(int j = 0; j < N; j++)
                if(board[i][j] == 'G')
                    board[i][j] = 'R';

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(visited[i][j]) continue;
                visited[i][j] = true;
                bfs(new Point(i, j));
                ret2++;
            }
        }
        System.out.println(ret1 + " " + ret2);
    }

    public static void bfs(Point start) {
        Queue<Point> q = new LinkedList<>();
        q.add(start);
        while(!q.isEmpty()) {
            Point cur = q.poll();
            for(int d = 0; d < 4; d++) {
                int ny = cur.y + dy[d];
                int nx = cur.x + dx[d];
                if(ny < 0 || nx < 0 || ny >= N || nx >= N || visited[ny][nx] || board[ny][nx] != board[cur.y][cur.x]) continue;
                visited[ny][nx] = true;
                q.add(new Point(ny, nx));
            }
        }
    }
}