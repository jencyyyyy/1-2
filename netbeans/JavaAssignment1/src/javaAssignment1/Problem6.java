package javaAssignment1;

import java.util.Scanner;


public class Problem6 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter your number: ");
        int n= s.nextInt();
        
        for(int i=2;i<=n;i+=2){
            System.out.print(i);
            if(i!=n){
                System.out.print(" + ");
            }
        }
        System.out.println();
    }
}

