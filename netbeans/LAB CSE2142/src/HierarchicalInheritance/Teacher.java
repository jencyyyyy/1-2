package HierarchicalInheritance;
//Teacher Class
class Teacher extends Person{
    public Teacher(String name, int age, char gender) {
        super(name, age, gender);
    }    
    public void test(){
        System.out.println(super.name +" made test question\n");
    }       
    @Override
    public void display(){
            System.out.print("Teacher");
            super.display();
    }
}

