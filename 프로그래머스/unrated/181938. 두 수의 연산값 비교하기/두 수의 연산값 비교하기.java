class Solution {
    public int solution(int a, int b) {
        String a1 = Integer.toString(a);
        String b1 = Integer.toString(b);
        String ab = a1 + b1;
        int ab1 = Integer.valueOf(ab);
        int ab2 = 2*a*b;
        
        if (ab1 >= ab2){
            return ab1;
        } else{
            return ab2;
        }
    }
}