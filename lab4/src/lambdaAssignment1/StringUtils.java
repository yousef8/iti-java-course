package lambdaAssignment1;

import java.util.function.BiPredicate;

public class StringUtils {
  public String betterString(String str1, String str2, BiPredicate<String, String> cmp) {
    if (cmp.test(str1, str2)) {
      return str1;
    }
    return str2;
  }
}
