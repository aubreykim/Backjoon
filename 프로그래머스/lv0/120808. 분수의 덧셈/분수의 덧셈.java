class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
        int bottom = denom1 * denom2;
        
        numer1 = numer1*denom2;
        numer2 = numer2*denom1;
        
        int top = numer1+numer2;
        
        for (int i = bottom; i >= 2; i--) {
            if (top%i == 0 && bottom%i == 0) {
                top = top/i;
                bottom = bottom / i;
            }
        }
        
        int[] answer = {top, bottom};
        
        return answer;
    }
}