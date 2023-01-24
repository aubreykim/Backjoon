class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = strlist[i].length();
        }
        return answer;
    }
}

/*

        this code is which one doesn't need double loop;
        But this is should cast String array -> HashSet;
        
        HashSet<String> set = new HashSet<>(List.of(s1));
        for (String s : s2) {
            if(set.contains(s)){
                answer++;
            }
        }
*/
