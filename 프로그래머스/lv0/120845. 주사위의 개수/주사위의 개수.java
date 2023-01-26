class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        
        answer = box[0]/n;
        answer = answer*(box[1]/n);
        answer = answer*(box[2]/n);
        
        return answer;
    }
}