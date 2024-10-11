import java.util.*;

class Solution {
    static int mr, mc, min = Integer.MAX_VALUE;
    static int[] dr = new int[]{-1, 1, 0, 0};
    static int[] dc = new int[]{0, 0, -1, 1};
    static boolean[][] visit;
    static int[][] map;
    
    public int solution(int[][] maps) {
        mr = maps.length;
        mc = maps[0].length;
        map = maps;
        visit = new boolean[mr][mc];
        
        bfs();
        
        if(min == Integer.MAX_VALUE)
            return -1;
        return min;
    }
    static void bfs(){
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0,0,1});
        
        while(!q.isEmpty()){
            int[] cur = q.poll();
            if(cur[0] == mr-1 && cur[1] == mc-1){
                min = Math.min(min, cur[2]);
                return;
            }
            for(int i = 0; i < 4; i++){
                int nr = cur[0] + dr[i];
                int nc = cur[1] + dc[i];
                if(nr >= 0 && nc >= 0 && nr < mr && nc < mc && !visit[nr][nc] && map[nr][nc] != 0){
                    visit[nr][nc] = true;
                    q.offer(new int[]{nr,nc,cur[2]+1});
                }
            }
        }
    }
    
}