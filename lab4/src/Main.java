import myexception.*;

public class Main {
    public static void main(String[] args) {
    Test test = new Test();

    try {
        int res = test.divide(5, 0);
        System.out.println("Division result = "  + res);
    }
    catch(MyException e){
        System.out.println("Division Exception : " + e.getMessage());
    }

    try {
        double res = test.sqrt(-5);
        System.out.println("Square Root result : " + res);
    }
    catch (Exception e ){
        System.out.println( "Square Root Exception : " + e.getMessage());
    }

    try {
        double res = test.difference(5, 10);
        System.out.println("Difference result is : " + res);

    }
    catch (MyException e){
        System.out.println("Difference Exception : " + e.getMessage());
    }
    finally {
        System.out.println("--------------End Of Test--------------------");
    }
    }
}