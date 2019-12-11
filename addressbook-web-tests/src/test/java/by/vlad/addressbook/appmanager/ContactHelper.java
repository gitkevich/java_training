package by.vlad.addressbook.appmanager;

import by.vlad.addressbook.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

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

    public void selectContact() {
        click(By.name("selected[]"));
    }

    public void initContactModification() {
        click(By.xpath("//img[@alt='Edit']"));
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
}
