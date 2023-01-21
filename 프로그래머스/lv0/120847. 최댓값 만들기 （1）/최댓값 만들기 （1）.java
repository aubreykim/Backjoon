import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Collections;

class Solution {
    public int solution(int[] numbers) {
        
        //ArrayList<String> list= Arrays.asList();
        //Arrays.asList는 String 타입
        
        List<Integer> list  = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        Collections.sort(list, Collections.reverseOrder());
        
        //Arrays.sort()와 Collections.sort() 
        return list.get(0)*list.get(1);
    }
}