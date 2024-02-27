package HierarchicalInheritance;
//Main Class
public class HierarchicalInheritance {
    public static void main(String[] args) {
        Principal p = new Principal("Chris", 52, 'm');
        Teacher t = new Teacher("Milanine",35,'f');
        Student s1 = new Student("Phillip", 23,'m');
        Student s2 = new Student("Donna",21,'f');
        
        p.display();
        p.meeting();
        t.display();
        t.test();
        s1.display();
        s1.exam();
        s2.display();
        s2.exam();   
    }
}
