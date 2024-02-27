import java.io.*;
import java.util.*;
 
public class  ReverseLines{
    public static void main (String [] args) throws IOException{

        String inputFile = args[0];

        FileReader fr = new FileReader(inputFile);
   
        BufferedReader reader = new BufferedReader(fr);
        String data = reader.readLine();      
        while(data != null){
            String get = gdata(data);
            System.out.println(get);
            
            data = reader.readLine();
        }
 
        fr.close();
       
    }
     
    public static String gdata(String d){
        StringTokenizer st = new StringTokenizer(d, "\"-.,;", true);
        String g = "";
        while(st.hasMoreTokens()){
            String s = st.nextToken();
            int count = s.length();
            if(count == 1){
                g += s;
            }
            else{
                StringTokenizer st2 = new StringTokenizer(s, " ", true);
                while(st2.hasMoreTokens()){
                    String s2 = st2.nextToken();
                    int count2 = s2.length();
                    for(int i = 1; i <= count2; i++){
                        char c = s2.charAt(count2-i);
                        g += c;
                    }
                }
            }
        }
        return g;
    }
}