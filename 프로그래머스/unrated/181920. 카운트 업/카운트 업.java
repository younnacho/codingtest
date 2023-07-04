class Solution {
    public int[] solution(int start, int end) {
        int[] answer = new int[end-start+1]; // 8개 담을 수 있는 배열 생성 
        for(int i=0; i<=end-start; i++){
            answer[i] = i+start;
        }   
        return answer;
    }
}