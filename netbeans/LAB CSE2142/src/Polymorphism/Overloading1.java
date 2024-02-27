package Polymorphism;
class A{
    int height;
    A(){
        System.out.println("House made of Bricks");
        height=0;
    }
    A(int i){
        System.out.println("House is "+i+" feet tall");
        height=i;
    }
    void info(){
        System.out.println("House is "+height+" feet tall");
    }
    
    void info(String S){
        System.out.println( S +" : House is "+height+" feet tall");
    }
}
public class Overloading1 {
    public static void main(String[] args) {
        A a = new A();//Constuctor with no parameter
        a.info(); //method with no parameter
        a.info("Overloading Method");// method with one parameter
        
        A a1 = new A(5);//Overloading Constructor with 1 parameter
    }
}
