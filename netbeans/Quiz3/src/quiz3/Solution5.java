package quiz3;


/*
5. How do you generate a random floating-point number ≥0 and <100? 

*/
import java.util.Random;
public class Solution5 {
    public static void main(String[] args) {
        int min= 0, max= 100;
        Random v= new Random();
        float r = (float) (min + v.nextFloat((float)max));
        System.out.println("RANDOM NUMBER: "+ r);
    }
}
