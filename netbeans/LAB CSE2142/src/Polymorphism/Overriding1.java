package Polymorphism;

class Animal{
    public void eat(){
            System.out.println("Eatting");
    }
}
class Cat extends Animal{
    @Override
    public void eat(){
        System.out.println("Cat eatting");
    }
}

public class Overriding1 {
    public static void main(String[] args) {
        Animal a= new Animal();
        a.eat();
        Cat kitty = new Cat();
        kitty.eat();
        
    }
}
