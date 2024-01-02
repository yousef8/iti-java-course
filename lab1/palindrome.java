class Palindrome {
  public static Boolean isPalindrome(String str){

    for(int front = 0, back = str.length() - 1; front < back; ++front, --back){
      if (! (str.charAt(front) == str.charAt(back)) ) {
        return false;
      }
    }

    return true;
  }
  public static void main(String args[]){
    if (args.length != 1) {
      System.out.println("Only 1 argument is allowed");
      return;
    }

    if(isPalindrome(args[0])){
      System.out.println("Palindrome");
      return;
    }

    System.out.println("Not Palindrome");
  }
}
