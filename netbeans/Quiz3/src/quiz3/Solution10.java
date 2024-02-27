package quiz3;


/*
10. Write Java code for a loop that simultaneously computes both the maximum and minimum of an array. 
*/

public class Solution10 {
    public static void main(String[] args) { 
        int[] array= {10,2,8,4,6,9,12,3};
        int max=array[0],min=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max= array[i];
            }
            
            if(array[i]<min){
                min = array[i];
            }
        }
        System.out.println("Max: "+ max+ " Min: "+ min);
    }
}
