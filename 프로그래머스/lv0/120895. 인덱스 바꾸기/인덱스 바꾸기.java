import java.util.*;

class Solution {
    public String solution(String my_string, int num1, int num2) {
        
        List<String> list = Arrays.asList(my_string.split(""));
        
        StringBuilder sb = new StringBuilder();
        
        String str = list.get(num1);
        list.set(num1, list.get(num2));
        list.set(num2, str);
        
        for (String temp : list) {
            sb.append(temp);
        }
        
        return sb.toString();
    }
}