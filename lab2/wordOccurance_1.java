import java.lang.String;

class WordOccurances {
  public static void main(String args[]){
    String sentence = "iti is awesome , but iti is hard";
    String searchWord = "iti";

    int count = 0;

    for(int i = 0; i <= sentence.length() - searchWord.length(); ++i){
      if (searchWord.equals(sentence.substring(i, i+searchWord.length()))) ++count;
    }

    System.out.println("[" + searchWord + "] repeated " + count + " times");

    return;
  }
}
