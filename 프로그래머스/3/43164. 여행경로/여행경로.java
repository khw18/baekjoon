import java.util.*;

class Solution {
    static String[][] tic;
    static boolean[] visit;
    static List<String[]> list;
    public String[] solution(String[][] tickets) {
        tic = tickets;
        visit = new boolean[tic.length];
        String[] arr = new String[tic.length+1];
        arr[0] = "ICN";
        list = new ArrayList<String[]>();
        dfs(0, arr);
       
        Collections.sort(list, (a, b) -> {
            for(int i = 0; i < a.length; i++){
                if(!a[i].equals(b[i]))
                    return a[i].compareTo(b[i]);
            }
            return 0;
        });
        String[] answer = list.get(0);
        return answer;
    }
    static void dfs(int dep, String[] arr){
        if(dep==tic.length){
            list.add(arr.clone());
            return;
        }
        for(int i = 0; i < tic.length; i++){
            if(!visit[i] && tic[i][0].equals(arr[dep])){
                visit[i] = true;
                arr[dep+1] = tic[i][1];
                dfs(dep+1, arr);
                visit[i] = false;
            }
        }
        
        
        
    }
}