class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
         int a = str1.length();
        for(int i =0 ; i<a; i++){
                answer = answer+str1.charAt(i)+str2.charAt(i); 
            }
        return answer;
    }
}