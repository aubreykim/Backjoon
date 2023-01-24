class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        String match = "[a,e,i,o,u]";
        answer = my_string.replaceAll(match, "");
        return answer;
    }
}