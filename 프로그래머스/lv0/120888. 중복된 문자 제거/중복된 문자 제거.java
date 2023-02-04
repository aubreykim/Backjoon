import java.util.*;
class Solution {
    public String solution(String my_string) {
        String[] array = my_string.split("");
        String[] result = Arrays.stream(array).distinct().toArray(String[]::new);
        
        StringBuilder sb = new StringBuilder();
        for (String temp : result) {
            sb.append(temp);
        }
        return sb.toString();
    }
}