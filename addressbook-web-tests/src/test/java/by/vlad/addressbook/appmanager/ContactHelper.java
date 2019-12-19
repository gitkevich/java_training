package by.vlad.addressbook.appmanager;

import by.vlad.addressbook.model.ContactData;
import by.vlad.addressbook.model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class ContactHelper extends HelperBase{

    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void submitContactForm() {
        click(By.name("theform"));
        click(By.xpath("(//input[@name='submit'])[2]"));
    }

    public void fillContactForm(ContactData cnt, boolean creation) {
        type(By.name("firstname"), cnt.getFirstname());
        type(By.name("lastname"), cnt.getLastname());
        type(By.name("home"), cnt.getHomenumber());
        type(By.name("email"), cnt.getEmail());
        type(By.name("company"), cnt.getCompany());
        type(By.name("title"), cnt.getTitle());

        if (creation) {
            new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(cnt.getGroup());
        } else {
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        }

    }

    public void addContact() {
        click(By.linkText("add new"));
    }

    public void selectContact(int index) {
        wd.findElements(By.name("selected[]")).get(index).click();
    }

    public void selectContactToEdit(int index) {
        wd.findElements(By.xpath("//img[@alt='Edit']")).get(index).click();
    }

    public void submitContactModification() {
        click(By.name("update"));
    }

    public void deleteSelectedContact() {
        click(By.xpath("//input[@value='Delete']"));
    }

    public void createContact(ContactData contactData, boolean b) {
        addContact();
        fillContactForm(contactData, b);
        submitContactForm();
    }

    public boolean isThereAContact() {
        return isElementPresent(By.name("selected[]"));
    }

    public int getContactCount() {
        return wd.findElements(By.name("selected[]")).size();
    }

    public List<ContactData> getContactList() {

        List<ContactData> contacts = new ArrayList<ContactData>();
        List<WebElement> elements = wd.findElements(By.name("entry"));
        for (WebElement element : elements){
            String name = element.getText();
            String id = element.findElement(By.tagName("input")).getAttribute("value");
            ContactData contact = new ContactData(id, name, null, null, null, null, null, null);
            contacts.add(contact);
        }
        return contacts;


    }
}
