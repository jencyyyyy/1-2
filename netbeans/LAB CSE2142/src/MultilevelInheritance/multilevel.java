package MultilevelInheritance;
import java.util.Scanner;

class CalculatorA{    
    public void add(float a, float b){
        System.out.println(a + " + "+ b + " = "+(a+b));
    }
}
class CalculatorB extends CalculatorA{
        public void sub(float a, float b){
        System.out.println(a + " - "+ b + " = "+(a-b));
    }
}
class CalculatorC extends CalculatorB{
        public void multiply(float a, float b){
        System.out.println(a + " X "+ b + " = "+(a*b));
    }
}
class CalculatorD extends CalculatorC{
        public void divide(float a, float b){
        System.out.println(a + " / "+ b + " = "+(a/b));
    }
}
public class multilevel {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        
        System.out.println("Enter 2 integers: ");
        float a = s.nextInt();
        float b = s.nextInt();
        
       CalculatorD c = new CalculatorD();
       
       c.add(a, b);
       c.sub(a, b);
       c.multiply(a, b);
       c.divide(a, b);
    }
}
