import java.util.StringTokenizer;

class WordOccuranceToken {
  public static void main(String args[]) {
    StringTokenizer st = new StringTokenizer("iti is awesome , but iti is hard");
    String searchWord = "iti";
    int count = 0;

    
    while(st.hasMoreTokens()){
      if (searchWord.equals(st.nextToken())) ++count;
    }

    System.out.println("[" + searchWord + "] repeated " + count + " times");

    return;

  }
}
