class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int odd = 0;
        int even = 0;
        for (int temp : num_list) {
           if (temp % 2 == 0) {
              even++;
           } else {
              odd++;
           }
        }
        answer[1] = odd;
        answer[0] = even;
        return answer;
    }
}