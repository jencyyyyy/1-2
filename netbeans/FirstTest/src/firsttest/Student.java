package firsttest;


public class Student extends Person{
    String std;
    
    public void studying(int hours){
        System.out.println("Name: " + name + " is studying for "+hours + " hours!!");
    }
    
    @Override
    public String toString(){
        return "Name: " + name + " Age: "+ age + " \nGender: " + gender + "Class: " + std;
    }
}
