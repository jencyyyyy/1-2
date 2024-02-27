package javaAssignment1;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter your String: ");
        String input= s.nextLine();
        
        //int i= input.length();
        
        int length=0;
        char[] strCharArray=input.toCharArray();
        for(char c:strCharArray){
           length++;
        }       
        
        System.out.println(" String Length: "+length);
    }
}
