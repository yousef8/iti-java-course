package packet.addressbook.util;

import packet.addressbook.model.Contact;

import java.util.ArrayList;
import java.util.List;

public class ContactUtil {
  public static List<Contact> getContacts(){
    List<Contact> contacts = new ArrayList<>();
    contacts.add(new Contact("1", "yousef", "ghonim", "12345673"));
    contacts.add(new Contact("2", "seif", "salam", "12345673"));
    contacts.add(new Contact("3", "muhammed", "ayman", "12345673"));

    return contacts;
  }
}
