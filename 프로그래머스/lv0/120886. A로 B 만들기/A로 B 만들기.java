import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;

        String[] beforeArray = before.split("");
        String[] afterArray = after.split("");
        
        if (beforeArray.length == afterArray.length) {
            List<String> list = new ArrayList(List.of(afterArray));
            
           for (String temp : beforeArray) {
               list.remove(temp);
           } 
            if (list.size() == 0) answer = 1;
        }
        return answer;
    }
}