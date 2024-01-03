package myexception;

import myexception.MyException;
public class Test {
    public int divide(int dividend, int divisor) throws MyException{
        if (divisor == 0) throw new MyException("Can't divide by zero");
        return dividend/divisor;
    }

    public double sqrt(double value) throws MyException {
        if (value < 0) throw new MyException("Can't square root negative numbers result will be imaginary");
        return Math.sqrt(value);
    }

    public double difference (double a, double b) throws MyException{
        if (a < b) throw new MyException("Left hand in subtraction is less than right hand");

        return a - b;
    }
}
