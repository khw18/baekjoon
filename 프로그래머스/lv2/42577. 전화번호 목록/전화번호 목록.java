import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
    	boolean answer = true;
    	
    	HashSet<String> set = new HashSet<String>();
    	
    	for (int i = 0; i < phone_book.length; i++) {
			set.add(phone_book[i]);
		}
        for(String pb:phone_book) {
        	for(int j=1; j<pb.length(); j++) {
              	// LCS : Longest Common Subsequence의 약자로 최장 공통 부분 문자열
                // substring과 비교하면 substring은 연속된 부분 문자열이고 	
                // subsequence는 연속적이지는 않은 부분 문자열
                // 2개의 String을 비교하여 최장 공통 부분 문자열을 구한다.
        		if(set.contains(pb.subSequence(0, j)))
        			answer = false;
        	}
        }
        return answer;
    }
}