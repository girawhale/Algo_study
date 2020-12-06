package class3.boj16236;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Boj16236_tk {
    static class Point implements Comparable<Point> {
        int d, y, x;

        public Point(int d, int y, int x) {
            this.d = d;
            this.y = y;
            this.x = x;
        }

        @Override
        public int compareTo(Point o) {
            if(this.d == o.d)
                if(this.y == o.y)
                    return this.x - o.x;
                else
                    return this.y - o.y;
            else
                return this.d - o.d;
        }
    }

    static int[] dy = {-1, 0, 0, 1}, dx = {0, -1, 1, 0};
    static int N, size = 2, ret = 0, count = 0;
    static int[][] map;
    static boolean[][] visited;
    static Point baby;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        map = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                map[i][j] = sc.nextInt();
                if (map[i][j] == 9) {
                    baby = new Point(0, i, j);
                    map[i][j] = 0;
                }
            }
        }
        while (true) {
            visited = new boolean[N][N];
            if (bfs() == -1)
                break;
        }
        System.out.println(ret);
    }

    public static int bfs() {
        PriorityQueue<Point> q = new PriorityQueue<>();
        visited[baby.y][baby.x] = true;
        q.add(baby);
        int l = 0;
        while (!q.isEmpty()) {
            int s = q.size();
            for (int c = 0; c < s; c++) {
                Point cur = q.poll();
                if (map[cur.y][cur.x] > 0 && map[cur.y][cur.x] < size) {
                    ret += l;
                    count++;
                    if (count == size) {
                        size++;
                        count = 0;
                    }
                    baby = new Point(0, cur.y, cur.x);
                    map[cur.y][cur.x] = 0;
                    return 1;
                }
                for (int d = 0; d < 4; d++) {
                    int ny = cur.y + dy[d];
                    int nx = cur.x + dx[d];
                    if (ny < 0 || nx < 0 || ny >= N || nx >= N || visited[ny][nx] || map[ny][nx] > size) continue;
                    visited[ny][nx] = true;
                    q.add(new Point(l, ny, nx));
                }
            }
            l += 1;
        }
        return -1;
    }
}