package mycomplex;

public class Main {
  public static void main(String[] args) {
    MyComplexDouble c1 = new MyComplexDouble(5.0, 3.4);
    MyComplexDouble c2 = new MyComplexDouble(3.8, 0.0);

    MyComplexDouble addRes = (MyComplexDouble) c1.add(c2);
    System.out.println(addRes);

    MyComplexDouble subRes = (MyComplexDouble) c1.sub(c2);
    System.out.println(subRes);

    MyComplexDouble mulRes = (MyComplexDouble) c1.multiply(c2);
    System.out.println(mulRes);

    try {
      MyComplexDouble divRes = (MyComplexDouble) c1.divide(c2);
      System.out.println(divRes);
    } catch (ArithmeticException err) {
      System.out.println("Exception : " + err.getMessage());
    }

  }
}
