class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {

        int[] answer = new int[num2-num1+1];
        System.arraycopy(numbers, num1, answer, 0, (num2-num1+1));
        return answer;
        
        /*
        stream 사용해서 copyOfRange 사용법 공부
        int[] answer = Arrays.copyOfRange(numbers, num1, num2);
        return answer;
        */
    }
}