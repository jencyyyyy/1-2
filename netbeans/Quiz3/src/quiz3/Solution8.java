package quiz3;



/*
8. Rewrite the following do loop into a while loop.
    int n = in.nextInt();
    double x = 0;
    double s;
    do{
    s = 1.0 / (1 + n * n);
    n++;
    x += s;
    }while (s > 0.01); 

*/
import java.util.Scanner;
public class Solution8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double x = 0;
        double s;
        s = 1.0 / (1 + n * n);
        
        while(s>0.010){
            s = 1.0 / (1 + n * n);
            n++;
            x += s;
        }
        System.out.println("X = "+x);
    }
}
