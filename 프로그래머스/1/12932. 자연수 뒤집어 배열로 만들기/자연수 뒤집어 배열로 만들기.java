class Solution {
    public int[] solution(long n) {
        
        StringBuilder sb = new StringBuilder(String.valueOf(n)).reverse();
        String[] str = sb.toString().split("");
        
        int[] answer = new int[str.length];
        
        for (int i = 0; i < str.length; i++){
            answer[i] = Integer.parseInt(str [i]);
        }
        return answer;
    }
}