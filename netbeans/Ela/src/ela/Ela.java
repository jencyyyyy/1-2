package ela;
class Test{
    String name;
    String sub;
    
    Test(String a,String b){
        name=a;
        sub=b;
    }
    public void display(){
        System.out.println("name: "+name+" sub = "+sub);
    }
}
public class Ela {
    public static void main(String[] args) {
        System.out.println("");
        Test p= new Test("a","cse");
        p.display();
        Test q= new Test("b","qwerty");
        q.display();
    }
}
