package quiz3;


/*
16. What is wrong with the following method that aims to fill an array with random numbers?
public void makeCombination(int[] values, int n){
Random generator = new Random();
int[] numbers = new int[values.length];
for (int i = 0; i < numbers.length; i++)
numbers[i] = generator.nextInt(n);
values = numbers;
} 
*/
import java.util.Random;

public class Solution16 {
    public static void main(String[] args) {
        int[] values={12,43,5,4,67,8,898,9};
        int n=10;
        System.out.println("Before: ");
        for(int i=0;i<values.length;i++){
            System.out.println(values[i]);
        }
        makeCombination(values,n);
        
        System.out.println("After: ");
        for(int i=0;i<values.length;i++){
            System.out.println(values[i]);
        }
        
    }

    public static void makeCombination(int[] values, int n){
        Random generator = new Random();
        
        int[] numbers = new int[values.length];
        
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = generator.nextInt(n);
        
        for(int i=0;i<numbers.length;i++){
            values[i] = numbers[i];
        }
    } 
}