class Solution {
    public String solution(String my_string) {
        
        String[] array = my_string.split("");
                
        StringBuffer sb = new StringBuffer();
        
        for (String temp : array) {
            
            if (Character.isUpperCase(temp.charAt(0))) {
                sb.append(temp.toLowerCase());
            } else if (Character.isLowerCase(temp.charAt(0))) {
                sb.append(temp.toUpperCase());
            }
            
        }
        
        return sb.toString();
    }
}