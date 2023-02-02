import java.util.*;

class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String temp = String.valueOf(num);
        
        List<String> list = Arrays.asList(temp.split(""));
        
        for (int i = 0; i < list.size(); i++) {
            if (String.valueOf(k).equals(list.get(i))) return i+1;
        }
        
        return -1;
    }
}