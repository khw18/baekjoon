class Solution {
    public int solution(int a, int b, int n) {
        int cnt = 0;
        while(n >= a){
            int q = n / a * b; // 현재 빈병으로 얻을 수 있는 새 병
            int r = n % a; // 남은 나머지
            cnt += q; // 현재 얻은 새 병
            n = q; // 바꿔 먹고 남은 빈병
            n += r; // 바꿔지지 않았던 빈병 더함
        }
        
        return cnt;
    }
}