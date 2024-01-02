class Repeat {
  public static void main (String args[]){
    System.out.println("Hello Inputs");
    if (args.length != 2) {
      System.out.println("Only 2 arguments allowed [integer string]");
      return;
    }
    
    try {
      int count = Integer.parseInt(args[0]);

      for(int i = 0; i < count; ++i){
        System.out.println(args[1]);
      }
    }
    catch(NumberFormatException err){
      System.out.println("The 1st arg isn't an integer");
    }

  }
}
