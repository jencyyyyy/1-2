package quiz3;



/*
6. Write a while loop that prints “All powers of two less than n.” For example, if n is 100, print 1 2 4 8 16
32 64. 
*/
import java.util.Scanner;
public class Solution6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        
        n = in.nextInt();
        int value=1;
        while(value*value<n){
            System.out.println(value*value);
            value++;
        }
    }
}