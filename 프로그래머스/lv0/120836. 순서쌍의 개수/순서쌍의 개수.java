class Solution {
    public int solution(int n) {
        
    /*
        error code!
        시간 초과와 실패 발생
        
        for (int i=1; i<= n; i++) {
            for (int j=1; j<=n; j++){
                if (i*j == n) {
                    answer++;
                
            }
        }
    */
        
        int answer = 0;
        
        for (int i=1; i<= n; i++) {
            if(n%i == 0) answer++;
        }
        
        return answer;
    }
}
