import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;
 

class Solution {
    public int[] solution(int n) {
        
        List<Integer> list = new ArrayList<>();
        
        for (int i= 0; i<=n; i++){
            if (i%2!=0) {
                list.add(i);
            }
        }

        int[] answer = list.stream().mapToInt(i -> i).toArray();
        
        return answer;
    }
}