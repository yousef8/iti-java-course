package packet.addressbook;

import packet.addressbook.util.ContactUtil;
import packet.addressbook.model.Contact;
import packet.addressbook.util.SortUtil;

import java.util.List;

public class Main {
  public static void main(String[] args){
    List<Contact> contacts = ContactUtil.getContacts();
    contacts = SortUtil.sortList(contacts);

    contacts.forEach(System.out::println);

  }
}
