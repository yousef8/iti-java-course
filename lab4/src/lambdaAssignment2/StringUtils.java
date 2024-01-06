package lambdaAssignment2;

import java.util.function.Predicate;

public class StringUtils {
  public static Boolean isAlphabet(String str) {
    Predicate<Character> filter = Character::isLetter;

    for (char c : str.toCharArray()) {
      if (!filter.test(c)) {
        return false;
      }
    }

    return true;
  }
}
