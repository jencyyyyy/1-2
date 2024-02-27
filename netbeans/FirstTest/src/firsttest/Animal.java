package firsttest;

class Cat{
    
    public void call(){
        System.out.println("Meaw Meaw");
    }
}

class Dog{
    public void call(){
        System.out.println("Woaf Woaf");
    }
}

public class Animal {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.call();
        
        Dog d = new Dog();
        d.call();       
    }
}
