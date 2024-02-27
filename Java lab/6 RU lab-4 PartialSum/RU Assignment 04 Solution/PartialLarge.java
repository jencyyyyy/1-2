
class PartialLarge extends Thread {

    private int[] arr;
    private int  start, end;
    private long Large;

    public PartialLarge(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    public long getLarge() {
    	
    	return Large;
    }

    public void run() {
        Large = largest(arr, start, end);
    }

    long maximum = 0;
    
    long largest(int[] arr, int start, int end) {
        
        for (int i = start; i <= end; i++) {
            if(arr[i] > maximum) { 
                maximum = arr[i];
            }
        }
           
        System.out.printf("Getting Maximum from %d to %d is %d\n\n",start,end,maximum);
        return maximum;
    }
    
    
}