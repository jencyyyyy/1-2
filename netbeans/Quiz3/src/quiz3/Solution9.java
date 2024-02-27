package quiz3;


/*
9. The nested loops
for (int i = 1; i <= height; i++) {
for (int j = 1; j <= width; j++) {
System.out.print("*");
}
System.out.println();
}
display a rectangle of a given width and height, such as
****
****
****
Write a single for loop that displays the same rectangle. 
*/
import java.util.Scanner;

public class Solution9 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int height, width;
        
        System.out.println("Enter height: ");
        height = in.nextInt();
        System.out.println("Enter Width: ");
        width = in.nextInt();
        
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("*");
            }
                System.out.println();
            }
    }
}
