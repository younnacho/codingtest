class Solution {
    public int solution(int[] num_list) {
        int b = 0;
        int c = 1;
        int answer = 0;
        int a = num_list.length;
        
        for(int i = 0; i<a; i++) {
             if (a >= 11) {
            b += num_list[i];
                 answer = b;
        } else {
                 c *= num_list[i];
                 answer = c;
             }
        }
        return answer;
    }
}