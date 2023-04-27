import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String,Integer> map = new LinkedHashMap<>();
        int temp = 0;
        for (String str : players) {
            map.put(str, temp++);
        }
        
        for (String s : callings) {
            int cur = map.get(s);
            map.put(s, cur - 1);
            map.put(players[cur - 1], cur);
            players[cur] = players[cur - 1];
            players[cur - 1] = s;
        }
        
        return players;
    }
}