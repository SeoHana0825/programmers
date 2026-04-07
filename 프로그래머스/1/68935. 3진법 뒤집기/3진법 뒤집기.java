class Solution {
    public int solution(int n) {
        
        String base = Integer.toString(n,3);
        String reversed = new StringBuilder(base).reverse().toString();
        
        return Integer.parseInt(reversed, 3);
    }
}