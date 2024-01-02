import java.util.regex.Matcher;
import java.util.regex.Pattern;

class WordOccuranceRegex {

    public static void main(String[] args) {
      String str= "iti is awesome , but iti is hard, also wehidedediticanyouspotit";
      String searchPattern = "iti";
      int count = 0;

      Pattern pattern = Pattern.compile(searchPattern);
      Matcher matcher = pattern.matcher(str);
      // check all occurance
      while (matcher.find()) {
        ++count;
      }

      System.out.println("[" + searchPattern + "] occured [" + count + "] times ");
    }
}
