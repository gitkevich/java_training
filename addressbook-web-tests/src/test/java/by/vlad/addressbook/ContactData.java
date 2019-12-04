package by.vlad.addressbook;

public class ContactData {
    private final String firstname;
    private final String lastname;
    private final String homenumber;
    private final String email;
    private final String company;
    private final String title;

    public ContactData(String firstname, String lastname, String homenumber, String email, String company, String title) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.homenumber = homenumber;
        this.email = email;
        this.company = company;
        this.title = title;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getHomenumber() {
        return homenumber;
    }

    public String getEmail() {
        return email;
    }

    public String getCompany() {
        return company;
    }

    public String getTitle() {
        return title;
    }
}
