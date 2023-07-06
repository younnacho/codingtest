class Solution {
    public int solution(String num_str) {
        int answer = 0;
        int a = num_str.length();
        for(int i = 0; i<a; i++){
            int b = Integer.parseInt(num_str.substring(i,i+1));
                answer += b;
        }
        return answer;
    }
}