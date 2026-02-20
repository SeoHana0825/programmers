class Solution {
    public int solution(int hp) {
        int[] ant = {5, 3, 1};
        int answer = 0;
        
        for (int i = 0; i < ant.length; i++) {
            if (hp/ant[i] != 0) {
                answer += hp / ant[i];
                hp %= ant[i];
            }
        }
        return answer;
    }
}