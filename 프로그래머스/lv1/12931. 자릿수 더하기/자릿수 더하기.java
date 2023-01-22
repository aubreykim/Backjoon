import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String temp = n+"";
        String[] array = temp.split("");
        
        for (int i=0; i<array.length; i++) {
            answer += Integer.valueOf(array[i]);
        }

        return answer;
    }
}