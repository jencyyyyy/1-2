/**
 Greatest among 3 numbers.
 **/

package javaAssignment1;
import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) { 
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter 1st number: ");
        int a= s.nextInt(); // scanf("%d",&a);
        
        System.out.println("Enter 2nd number: ");
        int b= s.nextInt();
        
        System.out.println("Enter 3rd number: ");
        int c= s.nextInt();        
        if(a>b){
            if(a>c){
                System.out.println(a + " Largest");
            }else{
                System.out.println(c + " Largest");
            }
        }else{
            if(b>c){
                System.out.println(b+ " Largest");
            }else{
                System.out.println(c+ " Largest");
            }
        }      
    }
}
