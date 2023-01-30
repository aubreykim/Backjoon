class Solution {
    public int solution(int n) {
        int answer = 1;
        while (answer <= n) {
            if ((answer*6)%n == 0) break;
            answer++;
        }
        return answer;
    }
}