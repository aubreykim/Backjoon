import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] nums) {
        //가져갈 폰켓몬
        int takePokemon = nums.length/2;
        
        Set<Integer> tempSet = new HashSet<>();
        for (int i : nums) {
            tempSet.add(i);
        }
        int answer = (tempSet.size() > takePokemon ? takePokemon : tempSet.size());
        return answer;
    }
}