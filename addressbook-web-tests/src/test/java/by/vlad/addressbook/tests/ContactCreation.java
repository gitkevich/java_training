package by.vlad.addressbook.tests;

import by.vlad.addressbook.model.ContactData;
import org.testng.annotations.*;

public class ContactCreation extends TestBase {

  @Test
  public void testContactCreation() {
    app.getContactHelper().addContact();
    app.getContactHelper().fillContactForm(new ContactData("John", "Smith", "487334564", "jsmith@gmail.com", "Tesla Corp", "Engineer"));
    app.getContactHelper().submitContactForm();
    app.getNavigationHelper().returnToHome();
  }
}
