class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        int b = (brown + 4) / 2;
        for(int cl = 1; cl < brown; cl++){
            for(int rl = 1; rl <= cl; rl++){
                if(rl+cl == b){
                    if((rl-2) * (cl-2) == yellow){
                        return new int[]{cl, rl};
                    }
                }
            }
        }
        return answer;
    }
}