package quiz3;

/*
4. How do you simulate a coin toss with the Random class? 
*/
public class Solution4 {
    public static void main(String[] args) { 
    if (Math.random() < .5){
        System.out.println("Heads");
    }else{
        System.out.println("Tails");
    }
    }
}
