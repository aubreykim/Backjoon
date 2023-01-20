class Solution {
    public String solution(String my_string, int n) {
        StringBuffer sb = new StringBuffer();
        
        char[] charArray = my_string.toCharArray();
        for (char ch: charArray) {
            for (int i = 0; i< n; i++) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}