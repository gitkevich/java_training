package by.vlad.addressbook.tests;

import by.vlad.addressbook.model.ContactData;
import by.vlad.addressbook.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class ContactCreation extends TestBase {

  @Test
  public void testContactCreation() {
    List<ContactData> before = app.getContactHelper().getContactList();

    ContactData contact = new ContactData("John", "Smith", "487334564", "jsmith@gmail.com", "Tesla Corp", "Engineer", "Test1");
    app.getContactHelper().createContact(contact, true);
    app.getNavigationHelper().gotoHomePage();

    List<ContactData> after = app.getContactHelper().getContactList();

    Assert.assertEquals(after.size(), before.size() + 1);


    before.add(contact);
    Comparator<? super ContactData> byId = (g1, g2) -> Integer.compare(g1.getId(), g2.getId());
    before.sort(byId);
    after.sort(byId);
    Assert.assertEquals(before, after);
  }
}
