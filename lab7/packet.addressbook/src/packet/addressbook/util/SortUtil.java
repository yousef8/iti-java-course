package packet.addressbook.util;

import packet.addressbook.model.Contact;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortUtil {
  public static List<Contact> sortList(List<Contact> list) {
    list.sort(Comparator.comparing(Contact::getFirstName));
    return list;
  }
}
