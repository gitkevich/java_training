package by.vlad.addressbook.tests;

import by.vlad.addressbook.model.ContactData;
import org.testng.annotations.Test;

public class ContactModificatonTests extends TestBase {
    @Test
    public void testContactModification(){
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData("John", "Smith", "487334564", "jsmith@gmail.com", "Tesla Corp", "Engineer", null), false);
        app.getContactHelper().submitContactModification();
    }
}
