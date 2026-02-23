class Solution {
    public String solution(String rsp) {
        
        StringBuilder sb = new StringBuilder();
        
        for (String s : rsp.split("")) {
            if(s.equals("2")) {
                sb.append("0");
            } else if(s.equals("0")) {
                sb.append("5");
            } else {
                sb.append("2");
            }
        }
        String answer = sb.toString();
        return answer;
    }
}