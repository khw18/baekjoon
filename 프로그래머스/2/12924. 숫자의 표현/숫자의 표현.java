class Solution {
    static int cnt = 1, num;
    public int solution(int n) {
        num = n;
        dfs(1);
        int answer = cnt;
       
        return answer;
    }
    static void dfs(int s){
        if(s == num)
            return;
        int sum = 0;
        for(int i = s; sum < num; i++){
            sum += i;
        }
        if(sum==num)
            cnt++;
        dfs(s+1);
    }
}