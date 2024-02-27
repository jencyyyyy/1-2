package SingleInheritance2;
import java.util.Scanner;

class Animal{
    public void sleep(int hours){
        System.out.println("Sleeps "+ hours + " hours a day");
    }
}
class Cat extends Animal{
        public void voice(){
        System.out.println("Cat says: Meaw Meaw");
    }    
        @Override
        public void sleep(int h){
            System.out.print("Cat ");
            super.sleep(h);
    }
}
public class problem2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);        
        Cat cat = new Cat();
        
        System.out.println("How long your cat sleeps:");
        int h = s.nextInt();
        cat.sleep(h);
        cat.voice();    
    }
}

