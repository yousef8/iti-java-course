import java.lang.String;

class WordOccurancesV2 {
  public static void main(String args[]) {
    String sentence = "iti is awesome , but iti is hard";
    String searchWord = "hard";

    int count = 0;

    int lastOccuranceIdx = 0;

    while (lastOccuranceIdx != -1) {
      lastOccuranceIdx = sentence.indexOf(searchWord, lastOccuranceIdx);
      if (lastOccuranceIdx != -1) {
        lastOccuranceIdx += searchWord.length();
        ++count;
      }
    }

    System.out.println("[" + searchWord + "] repeated " + count + " times");

    return;
  }
}
