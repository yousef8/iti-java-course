package lambdaAssignment1;

public class Main {
  public static void main(String[] args) {
    StringUtils strUtil = new StringUtils();

    String str1 = "yousef";
    String str2 = "Omar is the best";

    String longer = strUtil.betterString(str1, str2, (s1, s2) -> s1.length() > s2.length());
    String first = strUtil.betterString(str1, str2, (s1, s2) -> true);

    System.out.println("The longer string is : " + longer);
    System.out.println("The first string is : " + first);
  }
}
