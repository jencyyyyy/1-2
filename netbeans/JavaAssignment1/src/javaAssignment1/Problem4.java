/**
 4. String reverse
 **/
package javaAssignment1;
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter your String: ");
        String input= s.nextLine();
        
        String reverse= "";
        
        for(int i= input.length()-1;i>=0;i--){
            reverse += input.charAt(i);
        }
        reverse +='\0';
        
        System.out.println("Reverse String: "+reverse);
    }
}
