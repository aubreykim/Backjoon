import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] numlist) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int temp : numlist) {
            if (temp%n == 0) list.add(temp);
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}