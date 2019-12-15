package by.vlad.addressbook.tests;

import by.vlad.addressbook.model.ContactData;
import org.testng.Assert;
import org.testng.annotations.*;

public class ContactCreation extends TestBase {

  @Test
  public void testContactCreation() {
    int before = app.getContactHelper().getContactCount();
    app.getContactHelper().createContact(new ContactData("John", "Smith", "487334564", "jsmith@gmail.com", "Tesla Corp", "Engineer", "Test1"), true);

    app.getNavigationHelper().gotoHomePage();
    int after = app.getContactHelper().getContactCount();

    Assert.assertEquals(after, before + 1);
  }
}
