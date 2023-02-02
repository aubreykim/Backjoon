import java.util.*;

class Solution {
    public int solution(int order) {
        int answer = 0;
        
        List<String> list = Arrays.asList((order+"").split(""));
        for (String temp : list) {
            if (Integer.valueOf(temp) != 0 && Integer.valueOf(temp) % 3 == 0) answer++;
        }
        
        return answer;
    }
}