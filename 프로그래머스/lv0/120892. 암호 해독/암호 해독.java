class Solution {
    public String solution(String cipher, int code) {

        StringBuffer sb = new StringBuffer(cipher);
        StringBuffer temp = new StringBuffer();
        
        for (int i = 1; i <= cipher.length(); i++) {
            if (i % code == 0) {
                temp.append(sb.charAt(i-1));
            }
        }
        return temp.toString();
    }
}