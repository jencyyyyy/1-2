import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
 
public class ReverseLine {
    public static void main(String[] args) {
        String inFile = args[0];
        String outFile = args[1];
        
        File file = new File("input.txt");
        File outfile = new File("output.txt");
        //FileWriter fw = new FileWriter("output.txt");
        int index = 0;
        String[] lines = new String[100];
        String[] revLines = new String[100];
        
        try {
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = br.readLine()) != null) {
                    // System.out.println(line);
                    lines[index++] = line; 
                    
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //System.out.println(lines.length);
        int revIndex = 0; 
            for(int i= index-1; i>=0; i--){
                System.out.println(lines[i]);
            } 
    }
}