class Solution {
    public int solution(int[] num_list) {
        int answer1 = 1;
        int answer2 = 0; 
    
        for(int i = 0; i<num_list.length;i++){
        answer1*= num_list[i];
        answer2+=num_list[i];}
       
        answer2 = answer2*answer2;
        
        if(answer1<answer2){
            return 1;
        } else{return 0;}
        
        
    }
}