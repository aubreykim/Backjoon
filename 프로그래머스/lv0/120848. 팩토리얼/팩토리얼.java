class Solution {
    public int solution(int n) {
    
        int answer = 0;
        
        for (int i = 0; i <= 10; i++) {
           int multiple = 1;
            
            for (int j = 2; j <= i; j++) {
                multiple *= j;
            }
            
            if (multiple <= n) answer = i;
        }

        return answer;
    }
}