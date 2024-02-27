package HierarchicalInheritance;
//Principal Class
class Principal extends Person{
    public Principal(String name, int age, char gender) {
        super(name, age, gender);
    }
    
    public void meeting(){
        System.out.println(super.name +" called for meeting\n");
    }  
    
    @Override
    public void display(){
            System.out.print("Principal");
            super.display();
    }
}
