package HierarchicalInheritance;
//Person Class
class Person{
    String name;
    int age;
    char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    
    public void display(){
        System.out.println("'s Name= "+name +", age= "
                + age+ ", gender= "+gender);
    }
}
