package p5;


public class JackFruit extends Fruit {
    
    String taste;
    
    public JackFruit(String name) {
        super(name);
    }

    JackFruit(String name, String place, String taste) {
        super(name);
        super.setPlace(place);
        this.taste = taste; 
    }

    @Override
    public void getInfo() {
    }

    void setPlace(Mango mangoOne) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
