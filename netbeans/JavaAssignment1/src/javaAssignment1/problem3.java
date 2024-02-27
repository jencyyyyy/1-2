/**
 3. Palindrome check
 **/
package javaAssignment1;

import java.util.Scanner;


public class problem3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter your number: ");
        int n= s.nextInt(); 
        int temp=n;
        int reverse=0,remainder;
        
        while(n!=0){
            remainder = n%10;
            reverse = reverse*10+remainder;
            n= n/10;
        }
        
        if(temp==reverse){
            System.out.println(temp +" is palindrome");
        }else{
            System.out.println(temp +" is Not palindrome");
        }
        
    }
}
