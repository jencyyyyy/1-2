package quiz4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class problem3 {
    public static void writeAll(String[] lines, String filename) throws FileNotFoundException{
     PrintWriter out = new PrintWriter(filename);
     for (String line : lines){
     out.println(line.toUpperCase());
     }
     out.close();
     }
}
