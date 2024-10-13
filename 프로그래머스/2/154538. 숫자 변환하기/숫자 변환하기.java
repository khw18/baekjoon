import java.util.*;

class Solution {
    static int ans = Integer.MAX_VALUE, plus, tgt;
    static boolean[] visit;
    public int solution(int x, int y, int n) {
        plus = n;
        tgt = y;
        visit = new boolean[y+1];
        bfs(x);
        return ans==Integer.MAX_VALUE ? -1 : ans;
    }
    static void bfs(int x){
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x, 0});
        visit[x] = true;
        
        while(!q.isEmpty()){
            int[] cur = q.poll();
            int cx = cur[0];
            int cnt = cur[1];
            if(cx == tgt)
                ans = Math.min(ans, cnt);
            if(cx*3 <= tgt && !visit[cx*3]){
                visit[cx*3] = true;
                q.offer(new int[]{cx*3, cnt+1});
            }
            
            if(cx*2 <= tgt && !visit[cx*2]){
                visit[cx*2] = true;
                q.offer(new int[]{cx*2, cnt+1});
            }
            
            if(cx+plus <= tgt && !visit[cx+plus]){
                visit[cx+plus] = true;
                q.offer(new int[]{cx+plus, cnt+1});
            }
        }
    }
}