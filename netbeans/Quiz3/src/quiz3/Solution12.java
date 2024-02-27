package quiz3;

/*
12. Write enhanced for loops for the following tasks.
i. Printing all elements of an array in a single row, separated by spaces.
ii. Computing the maximum of all elements in an array.
iii. Counting how many elements in an array are negative. 
*/
public class Solution12 {
    public static void main(String[] args) {
        
        int[] array = {12,-14,23,-11,76,-34,-18,90,22,26};
        int max = array[0];
        int count=0;
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+", ");
            
            if(array[i]>max){
                max = array[i];
            }
            
            if(array[i]<0){
                count++;
            }
        }
        System.out.println("\nMax value= " +max);
        System.out.println("Negative count= "+count);
        
        
    }
}
