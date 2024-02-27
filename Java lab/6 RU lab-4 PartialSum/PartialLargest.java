package ruassignment.pkg4;

public class PartialLargest extends Thread{

    private int[] arr;
    private int start, end;
    private long partial;
    
    public PartialLargest(int[] arr,int start,int end){
        this.arr = arr;
        this.start= start;
        this.end = end;
    }
    
    public long getPartial(){
        return partial;
    }
    
    public void run(){
        partial = largest(arr,start,end);
    }
    long max = 0;
    long largest(int[] arr, int start,int end){
        
        for(int i= start; i<=end; i++  ){
            if(arr[i]>max){
                max = arr[i];
            }
        }
   
        System.out.printf("Largest number from %d to %d = %d \n\n", start,end,max);
        
        return max;
        }
}
