package quiz3;

import java.util.ArrayList;

/*
What is wrong with each of the following code segments?
    i. ArrayList<int> values = new ArrayList<int>();
    
    ii. ArrayList<Integer> values = new ArrayList(); 
    
    iii. ArrayList<Integer> values = new ArrayList<Integer>;
    
    iv. ArrayList<Integer> values = new ArrayList<Integer>();
    for (int i = 1; i <= 10; i++)
    values.set(i - 1, i * i);
    
    v. ArrayList<Integer> values;
    for (int i = 1; i <= 10; i++)
    values.add(i * i);
*/

public class Solution14 {
    public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<Integer>(); //creating new generic arraylist  
        
        ArrayList valuess = new ArrayList(); //creating old non-generic arraylist 

        ArrayList<Integer> value = new ArrayList<Integer>(); //last ar 1st bracket set

        ArrayList<Integer> valuues = new ArrayList<Integer>(); 
       for (int i = 1; i <= 10; i++)
       values.set(i - 1, i * i);

        ArrayList<Integer> valuees=  new ArrayList<>(); // must set the 2nd portion
       for (int i = 1; i <= 10; i++)
       values.add(i * i);
    }
}
