class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        // 최대공약수
        answer[0] = gcd(n, m);
        
        // 최소공배수
        answer[1] =(int) ((long) n * m / answer[0]);
        
        return answer;
    }
    
    public int gcd(int a, int b) {
        
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}