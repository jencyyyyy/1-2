package quiz3;

/*
2. What is wrong with the following loop for finding the position of the first space in a string?
1 boolean found = false;
2 condition = !found && position < str.length();
3 for (int position = 0; condition; position++) {
4 char ch = str.charAt(position);
5 if (ch == ' ') {
6 found = true;
7 }
8 } 
*/
public class Solution2 {
    public static void main(String[] args) {
        String str = "abcdef";
        boolean found = false;
        
        for (int position = 0; (!found && position < str.length()-1); position++) {
            char ch = str.charAt(position);
            if (ch == ' ') {
                found = true;
                break;   
            }
        }
        if(found){
            System.out.println(" Found ");
        }else{
            System.out.println("Not Found");
        }
    }
}
