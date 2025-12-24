class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
        // 분자 numer , 분모 denom
        int numer = (numer1 * denom2) + (numer2 * denom1);
        int denom = denom1 * denom2;
        
        // 최대공약수 찾기
        int max = 0;
        
        for (int i = 1; i <= numer && i <= denom; i++) {
            if (numer%i == 0 && denom%i == 0) {
                max = i;
            }
        }
        
            // 기약 분수
        numer = numer / max;
        denom = denom / max;
                
        return new int[] {numer, denom};

    }
}