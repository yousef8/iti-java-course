package lab3;

import java.util.function.*;

@FunctionalInterface
interface ThreeParameters {
  public Double[] calc(Double a, Double b, Double c);
}

class QuadraticRoot {

  public static void main(String args[]) {
    if (args.length != 3) {
      System.out.println("Only 3 arg required [a b c] of type decimals");
      return;
    }

    Double abc[] = new Double[3];
    try {
      abc[0] = Double.parseDouble(args[0]);
      abc[1] = Double.parseDouble(args[1]);
      abc[2] = Double.parseDouble(args[2]);
    } catch (NumberFormatException err) {
      System.out.println("Only Decimal numbers allowed");
      return;
    }

    Double p1 = Double.parseDouble(args[0]);
    Double p2 = Double.parseDouble(args[1]);
    Double p3 = Double.parseDouble(args[2]);

    ThreeParameters quadRoot = (a, b, c) -> {

      if (a == 0) {
        System.out.println("Cannot divide by zero");
        return new Double[0];
      }

      Double sqrtVal = b * b - 4 * a * c;
      if (sqrtVal < 0) {
        System.out.println("Root is imaginary");
        return new Double[0];
      }
      Double res[] = new Double[2];
      Double sqrtRes = Math.sqrt(sqrtVal);

      res[0] = (-b + sqrtRes) / (2 * a);
      res[1] = (-b - sqrtRes) / (2 * a);

      return res;
    };

    Double res[] = quadRoot.calc(p1, p2, p3);

    if (res.length == 0) {
      return;
    }

    System.out.println(" X = " + res[0] + " || X = " + res[1]);
    return;
  }
}
