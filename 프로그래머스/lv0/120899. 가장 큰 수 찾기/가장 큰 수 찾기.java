import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] array) {
        
        List<Integer> list = Arrays.stream(array)
                        .boxed()
                        .collect(Collectors.toList());
        Collections.sort(list);
        int max = list.get(list.size()-1);
        int index = Arrays.stream(array)
                        .boxed()
                        .collect(Collectors.toList()).indexOf(max);
        
        int[] answer = {max, index};
        return answer;
    }
}