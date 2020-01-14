package by.vlad.addressbook.tests;

import by.vlad.addressbook.model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ContactDeletionTests extends TestBase {
    @Test
    public void testContactDeletion(){

        if (! app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact(new ContactData("John", "Smith", "487334564", "jsmith@gmail.com", "Tesla Corp", "Engineer", "Test1"), true);
            app.goTo().returntoHomePage();
        }

        List<ContactData> before = app.getContactHelper().getContactList();

        app.getContactHelper().selectContact(before.size() - 1);
        app.getContactHelper().deleteSelectedContact();
        app.getSessionHelper().closeAlertWindow();
        app.getSessionHelper().findCssElement("div.msgbox");
        app.goTo().gotoHomePage();

        List<ContactData> after = app.getContactHelper().getContactList();

        Assert.assertEquals(after.size(), before.size() - 1);

        Assert.assertEquals(after.size(), before.size() - 1);

        before.remove(before.size() - 1);
        Assert.assertEquals(before, after);

    }
}
