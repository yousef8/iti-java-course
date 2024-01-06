package lambdaAssignment2;


public class Main {
  public static void main(String[] args) {

    for (int i = 0; i < args.length; ++i) {
      System.out.print(args[i] + " : ");
      if (StringUtils.isAlphabet(args[i])) {
        System.out.println("PURE Alphabets");
      } else {
        System.out.println("NOT PURE Alphabets");
      }
    }
  }
}
