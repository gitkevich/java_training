package by.vlad.addressbook.tests;

import by.vlad.addressbook.model.ContactData;
import org.testng.annotations.Test;

public class ContactModificatonTests extends TestBase {
    @Test
    public void testContactModification(){

        if (! app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact(new ContactData("John", "Smith", "487334564", "jsmith@gmail.com", "Tesla Corp", "Engineer", "Test1"), true);
            app.getNavigationHelper().returntoHomePage();
        }
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData("John", "Smith", "487334564", "jsmith@gmail.com", "Tesla Corp", "Engineer", null), false);
        app.getContactHelper().submitContactModification();
    }
}
