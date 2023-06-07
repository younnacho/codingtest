class Solution {
    public int solution(int a, int b) {
        
        String a1 = Integer.toString(a);
        String b1 = Integer.toString(b);
        String ab = a1 + b1;
        String ba = b1 + a1;
        int ab1 = Integer.valueOf(ab);
        int ba1 = Integer.valueOf(ba);
        
        if(ab1 >= ba1){
            return  ab1;
        }else{
            return ba1;
        }
        
        
    }
}