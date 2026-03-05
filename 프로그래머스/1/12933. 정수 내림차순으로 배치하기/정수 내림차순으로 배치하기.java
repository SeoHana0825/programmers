import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        String[] str = String.valueOf(n).split("");
        
        Arrays.sort(str, Collections.reverseOrder());
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length; i++) {
            sb.append(str[i]);
        }
        
        return Long.parseLong(sb.toString());
    }
}