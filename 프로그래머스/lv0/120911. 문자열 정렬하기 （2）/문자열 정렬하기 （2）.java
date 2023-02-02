import java.util.*;

class Solution {
    public String solution(String my_string) {
        
        my_string = my_string.toLowerCase();
        
        List<String> list = Arrays.asList(my_string.split(""));
        Collections.sort(list);
        
        StringBuilder sb = new StringBuilder();
        for (String temp : list) {
            sb.append(temp);
        }
        return sb.toString();
    }
}