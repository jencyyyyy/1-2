package Polymorphism;

class Bird{
    public void sing(){
        System.out.println("Wild birds: Tweet tweet");
    }
}

class TalkingBird extends Bird{
    @Override
    public void sing(){
        System.out.println("Talking Bird: whistles, laughes and talks.");
    }
}


public class Overriding2 {
    public static void main(String[] args) {
        Bird normalBird= new Bird();
        normalBird.sing();
        
        Bird Robin = new TalkingBird();
        Robin.sing();
        
    }
}
