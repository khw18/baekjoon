import java.util.*;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations); // 인용 횟수를 오름차순으로 정렬합니다.
        int n = citations.length;
        for (int i = 0; i < n; i++) {
            // 현재 인용 횟수(citations[i])가 남은 논문 개수(n - i)보다 작거나 같을 때
            if (citations[i] >= n - i) {
                return n - i; // H-Index를 반환합니다.
            }
        }
        return 0; // 모든 논문이 인용되지 않은 경우 H-Index는 0입니다.
    }
}
