package ruassignment.pkg4;
import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        
        Random rand = new Random();
        
        final int ARRAY_SIZE = 100000000;
        int[] arr = new int[ARRAY_SIZE];
        
        for( int i = 0; i < arr.length;i++){
            arr[i] = rand.nextInt(1000) + 1;    
        }
              
        int THREAD_COUNT = 4;
        
        PartialLargest [] largesValues = new PartialLargest [THREAD_COUNT];
        
        int size =ARRAY_SIZE / THREAD_COUNT;
        
        long t_start = System.currentTimeMillis();
        for(int i = 0; i< THREAD_COUNT; i++){
            largesValues[i] = new PartialLargest (arr, i*size,(i+1)*size-1);
            largesValues[i].start();
        }
        
        try{
            for(PartialLargest  large: largesValues){
                if(large!=null){
                    large.join();
                }
            }
        }catch(InterruptedException e){
            
        }
        
        long largestV = 0;
        
             
        for(PartialLargest  large: largesValues){
            if(large!= null){
                if(large.getPartial()>largestV)
                 largestV = large.getPartial(); 
            }
        }
        

   
        
        System.out.println("Largest = " + largestV);
        
        long t_end = System.currentTimeMillis();
        
        System.out.println("Total Time in mil= " + (t_end-t_start));
    }
}
