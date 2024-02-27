
import java.util.Random;

public class MaximumDemo {

    public static void main(String[] args) {

	    final int ARRAY_SIZE = 10000000; 
	    int[] arr = new int[ARRAY_SIZE];

	    for(int i = 0; i< arr.length; i++) {
	    	Random rand = new Random();  
	        arr[i] = rand.nextInt(1480910);
	    }

	    long maximum = 0;

	    int THREAD_COUNT = 4;

	    PartialLarge [] largest = new PartialLarge[THREAD_COUNT];
	    int size = ARRAY_SIZE/THREAD_COUNT;

	    long t_start = System.currentTimeMillis();
	    for(int i = 0; i < THREAD_COUNT; i++) {
	        largest[i] = new PartialLarge(arr, i*size,(i+1)*size-1);
	        largest[i].start();
	    }

	    try {
	            
            for(PartialLarge large : largest) {
	            if(large!=null) {
	                large.join();
	            }
	    	}
	    } catch(InterruptedException e) {}

	    maximum = 0;
	    
	    for(PartialLarge large : largest) {
	        if(large!=null) {
	            if(large.getLarge() > maximum)
	            maximum = large.getLarge();
	        }
	    }
	    
	    System.out.println("MAXIMUM = " +maximum);
	    long t_end = System.currentTimeMillis();
	    System.out.println("Total Time in mil= "+ (t_end-t_start));
	


    }
}