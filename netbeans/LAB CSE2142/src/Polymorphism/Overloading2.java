package Polymorphism;

class Dog{
    public void eat(){
        System.out.println("Dog eating");
    }
    public void eat(int times){
        System.out.println("Eats "+times+" times");
    }
}

public class Overloading2 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.eat(3);
    }
}
