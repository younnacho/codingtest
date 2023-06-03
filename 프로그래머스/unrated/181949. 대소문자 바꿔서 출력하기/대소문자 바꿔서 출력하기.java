import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int b = a.length();
        char c;
        
        for(int i=0; i<b; i++) {
            
            c = a.charAt(i);
            if(Character.isUpperCase(c)==true){
                System.out.print(Character.toLowerCase(c));
            }else {
                System.out.print(Character.toUpperCase(c));
            }
        }
    }
}