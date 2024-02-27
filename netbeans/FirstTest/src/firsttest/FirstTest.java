package firsttest;


public class FirstTest {

    public static void main(String[] args) {
      Student s1 = new Student();
      
      s1.name = "XYZ";
      s1.age= 16;
      s1.gender = 'f';
      s1.std = "XI";
      
      s1.eat();
      
      s1.studying(5);
      String s = s1.toString();
      
        System.out.println(s);
    }

}
