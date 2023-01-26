import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int[] solution(String my_string) {
        //아스키코드 활용해 보기
        
        ArrayList<Integer> list = new ArrayList<>();
        for (char temp : my_string.toCharArray()) {
            if (temp >= 48 && temp <= 57) {
                list.add(temp - '0');
            }
        }
        Collections.sort(list);
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}