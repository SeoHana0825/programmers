class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int pLent = p.length();
        Long pLon = Long.parseLong(p);
        
        for (int i = 0; i <= t.length() - pLent; i++) {
            String sub = t.substring(i, i+pLent);
            if (Long.parseLong(sub) <= pLon) {
                answer++;
            }
        }
        return answer;
    }
}