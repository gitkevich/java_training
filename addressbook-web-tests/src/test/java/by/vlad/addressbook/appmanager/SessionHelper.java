package by.vlad.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase {

    public SessionHelper(WebDriver wd) {
        super(wd);
    }

    public void login(String username, String password) {
        type(By.name("user"), username);
        type(By.name("pass"), password);
        click(By.xpath("//input[@value='Login']"));
    }

    public void closeAlertWindow(){
        wd.switchTo().alert().accept();
    }
    public void findCssElement(String element){
        find(By.cssSelector(element));
    }

}
