class Solution {
    public int[] solution(int[] num_list) {
        
        int doubleNum = 0;
        int singleNum = 0;
               
        for (int num : num_list) {
            if (num % 2 == 0) {
                doubleNum++;
        } else {
                singleNum++;
            }
      }
        int[] answer = {doubleNum, singleNum};
        return answer;
    }
}