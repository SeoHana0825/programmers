class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int ind = 0;
        
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                answer.append(' ');
                ind = 0;
            } else {
                if (ind % 2 == 0) {
                    answer.append(Character.toUpperCase(c));
                } else {
                    answer.append(Character.toLowerCase(c));
                }
                ind++;
            }
        }
        return answer.toString();
    }
}