import java.util.function.*;
class CelToFeh {

  public static void main(String args[]) {
    if(args.length != 1) {
      System.out.println("Only 1 arg required (Temperature)");
      return;
    }
  
    Double cel;
    try {
     cel =  Double.parseDouble(args[0]);
    }
    catch(NumberFormatException err) {
      System.out.println("Only Decimal numbers allowed");
      return ;
    }

    Function<Double, Double> celToFeh = (temp) -> {
      return (temp * (9.0/5.0)) + 32;
    };

    Double feh = celToFeh.apply(cel);
    
    System.out.println("[" + cel + "] cel = [" + feh + "] Feh");
    return ;
  }
}
