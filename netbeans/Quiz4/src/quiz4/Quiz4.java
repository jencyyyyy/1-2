package quiz4;
import java.util.Scanner;
public class Quiz4 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int number = 0;
        if (in.hasNextInt()) {
            number = in.nextInt();
        }
        String input = in.next();
        System.out.println("Number: " + number);
        System.out.println("Input: " + input);
    }
}
