package quiz3;
/*
1. What is wrong with the following loop for reading a sequence of values?
1 System.out.print("Enter values, Q to quit: ");
2 do{
3 double value = in.nextDouble();
4 sum = sum + value;
5 count++;
6 }while(in.hasNextDouble());

*/
import java.util.Scanner;


public class Solution1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double sum=0.0;
        int count =0;
        
        System.out.print("Enter values, Q to quit: ");
        do{
            double value = in.nextDouble();
            sum = sum + value;
            count++;
        }while(in.hasNextDouble()); 
        
        System.out.println("Sum: " +sum);
    }
}
