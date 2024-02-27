package Encapsulation;
class Fish{
    private String name;
    private String color;
    String type;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }   
    public void water(String type){
       this.type = type;
    }   
    @Override
    public String toString(){
        return "Your fish is "+ this.getName() + ".\nIt is " + this.getColor()
                + " and\nLives in " + type + " water!";        
    }
}
public class problem2 {
    public static void main(String[] args) {
        Fish guppy = new Fish();
        
        guppy.setName("Tiger guppy");
        guppy.setColor("Black and yellow");
        guppy.water("Salt");  
        System.out.println(guppy.toString());
    }
}
