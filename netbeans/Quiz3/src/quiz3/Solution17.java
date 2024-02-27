package quiz3;


/*
17. How do you perform the following tasks with array lists in Java?
i. Test that two array lists contain the same elements in the same order.
ii. Copy one array list to another.
iii. Fill an array list with zeroes, over writing all elements in it.
iv. Remove all elements from an array list. 
*/
import java.util.ArrayList;
import java.util.Collections;
public class Solution17 {
    public static void main(String[] args) {
        
        //i. Test that two array lists contain the same elements in the same order.

        ArrayList<String> firstList=new ArrayList<String>();  
        //adds elements to the arraylist  
        firstList.add("Apple");  
        firstList.add("asdf");    
        firstList.add("Mango");  
        System.out.println(firstList);  
        //second array list      
        ArrayList<String> secondList=new ArrayList<String>();  
        //adds elements to the arraylist  
        secondList.add("Apple");  
        secondList.add("Peaches");  
        secondList.add("Mango");  
        System.out.println(secondList); 
        boolean boolvalue = firstList.equals(secondList); //returns true because lists are equal  
        System.out.println(boolvalue); 
        
        //ii. Copy one array list to another.
        System.out.println("\nCopy one array list to another.");
        ArrayList<String> zoo = new ArrayList<String>();
        zoo.add("Zebra");
        zoo.add("Lion");
        zoo.add("Tiger");
        System.out.println("Copying from: "+ zoo);
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("Hi");
        list.add("World");
        System.out.println("Copying to: "+list);
        Collections.copy(list,zoo); // copying the ArrayList zoo to the ArrayList list
        
        System.out.println("Making 2nd list: "+list);
        /*
        //iii. Fill an array list with zeroes, over writing all elements in it. ~~~~~~Incomplete
        
        System.out.println("\nFill an array list with zeroes, over writing all elements in it.");
        ArrayList<Integer> zeros = new ArrayList<>();
        zeros.add(22);
        zeros.add(26);
        zeros.add(28);

        System.out.println(zeros);
        
        */
        
        //iv. Remove all elements from an array list. 
        System.out.println("\n Remove all elements from an array list. \n");
        ArrayList<Integer> empty = new ArrayList<>();
        empty.add(22);
        empty.add(26);
        empty.add(28);
        System.out.println("Filled list: " + empty);
        empty.removeAll(empty);
        
        System.out.println("Empty List: " +empty);
    }
}
