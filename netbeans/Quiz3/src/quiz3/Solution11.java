package quiz3;

/*
11. What is wrong with each of the following code segments?
    i. int[] values = new int[10];
    for (int i = 1; i <= 10; i++)
    values[i] = i * i;
    
    ii. int[] values;
    for (int i = 0; i < values.length; i++)
    values[i] = i * i;
*/
public class Solution11 {
    public static void main(String[] args) {
    /*
    int[] values = new int[10];
    for (int i = 1; i < 10; i++) // Index always starts from 0. Only placing elements in position 1 to 9
        values[i] = i * i;
    
    System.out.println("Array elements:");
    for(int i=0;i<values.length;i++){
            System.out.println(values[i]+ " ");
        }
    */
    int[] values = new int[10];; // Size not dfined
    for (int i = 0; i < values.length; i++)
    values[i] = i * i;
    
    
    }
}
