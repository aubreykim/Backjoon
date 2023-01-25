class Solution {
    public String solution(String rsp) {
        
        StringBuffer sb = new StringBuffer();
        
        String[] array = rsp.split("");
        for (String temp : array) {
            if (temp.equals("0")) {
                sb.append("5");
            } else if (temp.equals("2")) {
                sb.append("0");
            } else {
                sb.append("2");
            }
        }

        return sb.toString();
    }
}