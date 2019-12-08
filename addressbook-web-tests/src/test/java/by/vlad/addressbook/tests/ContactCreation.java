package by.vlad.addressbook.tests;

import by.vlad.addressbook.model.ContactData;
import org.testng.annotations.*;

public class ContactCreation extends TestBase {

  @Test
  public void testContactCreation() {
    addContact();
    fillContactForm(new ContactData("John", "Smith", "487334564", "jsmith@gmail.com", "Tesla Corp", "Engineer"));
    submitContactForm();
    returnToHome();
  }
}
