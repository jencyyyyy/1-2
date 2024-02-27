package Encapsulation;
class Person {
    private String name;
    private int age;
    String study;
    
    public void setName(String name) {
        this.name = name;
    } 
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void display(){
        System.out.println("Name: " + name + ", Age: " + age + ", BSc: " +study);
    } 
}
public class problem1 {
    public static void main(String[] args) {
        Person p1 = new Person();        
        p1.study = "CSE";        
        p1.setName("Teresa");
        p1.setAge(21);        
        System.out.println("Name: " + p1.getName() + ", Age: " + p1.getAge());        
        p1.display();
    }
}

