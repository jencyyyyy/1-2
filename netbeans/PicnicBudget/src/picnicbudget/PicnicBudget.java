package picnicbudget;
import java.util.Scanner;
public class PicnicBudget {
    
    public static int picnicBudget(int studentNo){
        int budget=0;
        
        if( studentNo <=100)
        {
            budget = 5000*studentNo;
            
        }else if((100<studentNo) &&(studentNo<=200))
        {
            budget = (studentNo-100)*4000 + 100*5000;
            
        }else if(200<studentNo)
        {
            budget = 100*5000 + 100*4000 + (studentNo-200)*3000;
        }
        
        return budget;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int students,budget;
        System.out.print("Enter student no: ");
        
        students = in.nextInt();
        
        budget = picnicBudget(students);
        
        System.out.println("Total Cost: "+ budget + "Tk.");
        
    }
}
