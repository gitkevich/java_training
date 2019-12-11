package by.vlad.addressbook.tests;

import by.vlad.addressbook.model.ContactData;
import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase {
    @Test
    public void testContactDeletion(){

        if (! app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact(new ContactData("John", "Smith", "487334564", "jsmith@gmail.com", "Tesla Corp", "Engineer", "Test1"), true);
            app.getNavigationHelper().returntoHomePage();
        }

        app.getContactHelper().selectContact();
        app.getContactHelper().deleteSelectedContact();
        app.getSessionHelper().closeAlertWindow();
     //   app.getSessionHelper().findCssElement("div.msgbox");
        app.getNavigationHelper().gotoHomePage();

    }
}
