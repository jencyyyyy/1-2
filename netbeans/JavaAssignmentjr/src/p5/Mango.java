package p5;


public class Mango extends Fruit {
    
    String taste;
    String place;
    static int count=0;
   
    static int noOfObjects = 0;
    {
        noOfObjects += 1;
    }
    
    public Mango(String name) {
        super(name);
    }

    Mango(String name, String place, String taste) {
        super(name);
        super.setPlace(place);
        this.taste = taste;
    }
    
    @Override
    public void getInfo() {
        System.out.println("Name :"+name+"\n" +
                            "Place : "+super.getPlace()+"\n" +
                            "taste :"+taste+"\n" 
                
                            );
    }

    
}
