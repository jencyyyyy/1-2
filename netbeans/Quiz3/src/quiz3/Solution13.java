package quiz3;
/*
13. Rewrite the following loops without using the enhanced for loop construct. Here, values is an array of
floating-point numbers.
i. for(double x : values)
total = total + x;
ii. for (double x : values)
if (x == target)
return true;
iii. int i = 0;
for (double x : values){
values[i] = 2 * x;
i++;
}
*/

public class Solution13 {
    public static void main(String[] args) {
        double[] values = {2.3,1.3,2.6,2.2,6.3,1.22};
        int x, target = 7;
        
        double total=0;
        for(x=0;x<values.length;x++){
            total += x;
        } 
        
        for(x=0;x<values.length;x++){
            if(x==target){
                //return true;
            }
        }
        int i=0;
        for(x=0;x<values.length;x++){
            values[i] = 2 * x;
            i++;
        }            
    }      
}

