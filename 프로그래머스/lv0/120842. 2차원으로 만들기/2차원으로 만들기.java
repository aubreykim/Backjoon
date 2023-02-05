class Solution {
    public int[][] solution(int[] num_list, int n) {
        int temp = 0;
        
        if (num_list.length%n == 0) {
            temp = num_list.length/n; 
        } else {
          temp = num_list.length/n + 1;
        }
        
        int[][] answer = new int[temp][n];
        
        int j = 0;
        
        for (int i = 0; i < answer.length; i++) {    
            for (int k = 0; k < n; k++) {
                answer[i][k] = num_list[j++];
            }
        }
        return answer;
    }
}