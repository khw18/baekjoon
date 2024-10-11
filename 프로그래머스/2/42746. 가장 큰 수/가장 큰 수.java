import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String[] arr = new String[numbers.length];
        for(int i = 0; i < numbers.length; i++)
            arr[i] = String.valueOf(numbers[i]);
        Comparator<String> comp = new Comparator<>(){
            @Override
            public int compare(String o1, String o2){
                return (o2+o1).compareTo(o1+o2);
            }
        };
        
        Arrays.sort(arr, comp);
        if(arr[0].equals("0"))
            return "0";
        StringBuilder sb = new StringBuilder();
        for(String s : arr){
           sb.append(s); 
        }
        
        String answer = sb.toString();
        return answer;
    }
}