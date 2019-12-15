package by.vlad.addressbook.tests;

import by.vlad.addressbook.model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase {
    @Test
    public void testContactDeletion(){

        if (! app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact(new ContactData("John", "Smith", "487334564", "jsmith@gmail.com", "Tesla Corp", "Engineer", "Test1"), true);
            app.getNavigationHelper().returntoHomePage();
        }

        int before = app.getContactHelper().getContactCount();

        app.getContactHelper().selectContact(before - 1);
        app.getContactHelper().deleteSelectedContact();
        app.getSessionHelper().closeAlertWindow();
        app.getSessionHelper().findCssElement("div.msgbox");
        app.getNavigationHelper().gotoHomePage();

        int after = app.getContactHelper().getContactCount();

        Assert.assertEquals(after, before - 1);

    }
}
