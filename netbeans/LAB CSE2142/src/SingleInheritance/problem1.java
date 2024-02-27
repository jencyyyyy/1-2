package SingleInheritance;
class Human{
    String name;
    public void person(){
        System.out.println("Hi, I am " + name);
    }
}
class student extends Human{
    String major;
    public void study(){
        System.out.println("I am studying BSc. in " + this.major);
    }
}
public class problem1 {
    public static void main(String[] args) {
        System.out.println("Inside main Class");
        
        student s1 = new student();
        s1.name = "Teresa";
        s1.major = "CSE";
        s1.person();
        s1.study();
    }
}
