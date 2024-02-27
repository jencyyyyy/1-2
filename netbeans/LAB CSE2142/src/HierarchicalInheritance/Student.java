package HierarchicalInheritance;
//Student Class
class Student extends Person{
    public Student(String name, int age, char gender) {
        super(name, age, gender);
    }
    
    public void exam(){
        System.out.println( super.name+ " attended Examination\n");
    }  
    
    @Override
    public void display(){
            System.out.print("Student");
            super.display();
    }
}
