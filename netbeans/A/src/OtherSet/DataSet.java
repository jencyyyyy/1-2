package OtherSet;

import java.util.Scanner;

public class DataSet {
    
    int size;
    double[] arr = new double[1000];
    static double sum=0;
    public DataSet( int maximumNumberOfValues){
        size = maximumNumberOfValues;
    }
    
    public void takearray(double[] array){
        System.arraycopy(array, 0, arr, 0, size);
    }
    
    public void adding(){
        
        for(int i=0;i<size;i++){
            add(arr[i]);
        }  
    }
    
    public void add(double value){
        sum+=value;
    }
    
    public double getSum(){
        return sum;
    }
    
    public double Maximum(){
        double max= arr[0];
        
        for(int i=1;i<size;i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }       
        return max;
    }
    
    public double Minimum(){
        double min= arr[0];
        
        for(int i=1;i<size;i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
    
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int sizeOfArray;
        System.out.println("Enter total no. of data: ");
        
        sizeOfArray = in.nextInt();
        
        DataSet a = new DataSet(sizeOfArray);
        
        System.out.println("Enter data:");
        
        double[] array = new double[1000]; 
        for(int i=0;i<sizeOfArray;i++){
            array[i] = in.nextDouble();
        }

        a.takearray(array);
        a.adding();
        System.out.println("Sum: "+ a.getSum());
        System.out.println("Average: " + a.sum/sizeOfArray);
        System.out.println("Maximum: "+ a.Maximum());
        System.out.println("Minimum: "+ a.Minimum());     
        
        
    }
}
