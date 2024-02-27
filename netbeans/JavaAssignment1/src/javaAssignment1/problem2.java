/**
 2. Prime or not prime
 **/

package javaAssignment1;
import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        int flag=0;       
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter your number: ");
        int n= s.nextInt(); 
        
        for (int i = 2; i <= n / 2; ++i) {   
            if (n % i == 0) {
              flag = 1;
              break;
            }
          }

        if (n == 1) {
            System.out.println("1 is neither prime nor composite.");
        } 
        else {
          if (flag == 0)
            System.out.println(n +" is a prime number.");
          else
            System.out.println(n + " is not a prime number.");
        
        }
        
    }
}
