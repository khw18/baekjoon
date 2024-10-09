import java.io.*;
import java.util.*;

class Solution {
    public int solution(int n, int[][] computers) {
        int cnt = 0;
        for(int i = 0; i < n; i++){
            if(computers[i][i] == 1){ //bfs 시동시 net_cnt++;
                bfs(n, computers, i);
                cnt++;
            }
        }
        int answer = cnt;
        return answer;
    }
    static void bfs(int n, int[][] coms, int s){
        Queue<Integer> q = new LinkedList<>();
        q.offer(s);
        
        while(!q.isEmpty()){
            int i = q.poll();
            coms[i][i] = 0;
            for(int j = 0; j < n; j++){
                if(coms[i][j] == 1){
                    coms[i][j] = 0;
                    coms[j][i] = 0;
                    q.offer(j);
                }
            }
        }
    }
}