package quiz3;

/*
3. Write nested loops that make the following pattern of brackets:
[][][][]
[][][][]
[][][][] 
*/
public class Solution3 {
    public static void main(String[] args) {
        int n=4;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("[]");
            }
            System.out.println();
        }
    }
}
