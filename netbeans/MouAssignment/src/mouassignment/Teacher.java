package mouassignment;


public class Teacher extends Person{
    String qualification;
    
    void DisplayInformation2(){
        super.DisplayInformation1();
        System.out.println("Qualification: "+qualification);
    }
}
