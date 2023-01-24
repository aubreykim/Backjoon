class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String temp = String.valueOf(n);
        String[] array = temp.split("");
        
        for (String str : array) {
            answer += Integer.valueOf(str);
        }
        return answer;
    }
}