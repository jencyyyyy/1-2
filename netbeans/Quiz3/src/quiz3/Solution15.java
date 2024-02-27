package quiz3;

/*
15. Consider the following loop for collecting all elements that match a condition; in this case, that the element is
larger than 100.
ArrayList<Double> matches = new ArrayList<Double>();
for (double element : values)
if (element > 100)
matches.add(element);
Trace the flow of the loop, where values contains the elements 110 90 100 120 80. Show two columns, for element
and matches. 
*/
import java.util.ArrayList;
public class Solution15 {
    public static void main(String[] args) {
        int i,j;
        int[] values = {110, 90, 100, 120, 80};
        ArrayList<Double> matches = new ArrayList<>();
        for (double element : values)
        if (element > 100){
            matches.add(element);
        }
        System.out.println("Elements");
        
        for(i=0; i< values.length;i++){
            System.out.println(values[i]);
        }
        System.out.println("Matches");
        for(i=0; i< matches.size();i++){
            System.out.println(matches.get(i));
        }
    }
}
