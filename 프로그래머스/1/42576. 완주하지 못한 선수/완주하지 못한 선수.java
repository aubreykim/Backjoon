import java.util.Map;
import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        
        Map <String, Integer> partMap = new HashMap<>();
        
        //참가자 리스트 생성
        for (String part : participant) {
            if (partMap.get(part) != null) {
                partMap.put(part, partMap.get(part)+1);
            } else {
                 partMap.put(part, 1);   
            }
        }
        
        //완주자 제거
        for (String comp : completion) {
            if(partMap.get(comp) > 1) {
                partMap.put(comp, partMap.get(comp)-1);
            } else {
                partMap.remove(comp);
            }
        }
        //하나만 남아야 함
        String result = String.valueOf(partMap.keySet().toArray()[0]);
        return result;
    }
}