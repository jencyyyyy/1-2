package com.mycompany.bdaytobinary;
import java.util.Scanner;
public class bdayToBinary {
    
public static void main(String args[]) {   
    Scanner s = new Scanner(System.in);   
    String bday;    
    System.out.println("Enter your birthday in digit only without space(DDMMYYYY): ");    
    bday = s.nextLine();
    
    int ibday;    
    ibday= Integer.parseInt(bday);
    System.out.println("Your birthday in binary: ");        
    System.out.println(Integer.toBinaryString(ibday));
    }
}
