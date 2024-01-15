package packet.addressbook.model;

public class Contact {
  private String id;
  private String firstName;
  private String lastName;
  private String homePhone;
  private String workPhone;
  private String email;

  public Contact(String _id, String fname, String lname, String phone){
    id = _id;
    firstName = fname;
    lastName = lname;
    homePhone = phone;
    workPhone = "";
    email = "";
  }

  @Override
  public String toString() {
    return String.format(id + ": " + getFirstName() + " " + getLastName());
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getWorkPhone() {
    return workPhone;
  }

  public void setWorkPhone(String workPhone) {
    this.workPhone = workPhone;
  }

  public String getHomePhone() {
    return homePhone;
  }

  public void setHomePhone(String homePhone) {
    this.homePhone = homePhone;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }
}
