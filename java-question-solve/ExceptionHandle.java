class Example_throw {
  public void testMethod(int x) throws Exp1, Exp2 {
    if (x < 0) {
      throw new Exp1("\nException 1 thrown\n");
    } else if (x > 0) {
      throw new Exp2("\nException 2 thrown\n");
    } else {
      System.out.println("\nx is zero\n");
    }
  }
}

class Exp1 extends Exception {
  public Exp1(String message) {
    super(message);
  }
}

class Exp2 extends Exception {

  public Exp2(String message) {
    super(message);
  }
}

class ExceptionHandle {
  public static void main(String[] args) {
    Example_throw example = new Example_throw();

    int value = 0;
    try {
      example.testMethod(value);
    } catch (Exp1 e1) {
      System.out.println(e1.getMessage());
    } catch (Exp2 e2) {
      System.out.println(e2.getMessage());
    }
  }
}