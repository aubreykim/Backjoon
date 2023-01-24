class Solution {
    public int solution(int n) {
        int answer = 2;
        
        for (int i=2; i < n; i++) {
            if (n/i == i && n%i == 0) {
                answer = 1;
            }
        }

    /*
        
        if (n % Math.sqrt(n) == 0) {
            return 1;
        } else {
            return 2;
        }
        
    */
        
        return answer;
    }
}
