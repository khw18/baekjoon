import java.util.*;

class Solution {
    static boolean[] visit;
    static Set<Integer> set;
    
    public int solution(String numbers) {
        visit = new boolean[numbers.length()];
        set = new HashSet<>();
        dfs(0, "", numbers);  // 초기화 후 DFS 호출
        
        int answer = 0;
        for (int i : set) {
            if (isP(i)) {
                answer++;  // 소수인 경우만 카운트
            }
        }
        
        return answer;
    }
    
    static void dfs(int dep, String sum, String numbers) {
        if (!sum.equals("")) {
            set.add(Integer.parseInt(sum));  // 합쳐진 숫자를 set에 추가
        }
        
        if (dep >= numbers.length()) {
            return;  // 재귀 종료 조건
        }
        
        for (int i = 0; i < numbers.length(); i++) {
            if (visit[i]) {
                continue;
            }
            
            visit[i] = true;
            dfs(dep + 1, sum.concat(numbers.charAt(i)+""), numbers);  // sum에 바로 이어 붙임
            visit[i] = false;
        }
    }
    
    static boolean isP(int n) {
        if (n < 2) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}
