package by.vlad.addressbook.tests;

import by.vlad.addressbook.model.ContactData;
import by.vlad.addressbook.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class ContactModificatonTests extends TestBase {
    @Test
    public void testContactModification(){

        if (! app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact(new ContactData("John", "Smith", "487334564", "jsmith@gmail.com", "Tesla Corp", "Engineer", "Test1"), true);
            app.getNavigationHelper().returntoHomePage();
        }

        List<ContactData> before = app.getContactHelper().getContactList();

        app.getContactHelper().selectContactToEdit(before.size() - 1);
        ContactData contact = new ContactData(before.get(before.size() - 1).getId(), "John", "Smith", "487334564", "jsmith@gmail.com", "Tesla Corp", "Engineer", null);
        app.getContactHelper().fillContactForm(contact, false);
        app.getContactHelper().submitContactModification();
        app.getNavigationHelper().returntoHomePage();

        List<ContactData> after = app.getContactHelper().getContactList();

        Assert.assertEquals(after.size(), before.size());

        before.remove(before.size() - 1);
        before.add(contact);
        Comparator<? super ContactData> byId = (g1, g2) -> Integer.compare(g1.getId(), g2.getId());
        before.sort(byId);
        after.sort(byId);
        Assert.assertEquals(before, after);
    }
}
