package by.vlad.addressbook.model;

public class ContactData {
    private final String firstname;
    private final String lastname;
    private final String homenumber;
    private final String email;
    private final String company;
    private final String title;
    private String group;

    public ContactData(String firstname, String lastname, String homenumber, String email, String company, String title, String group) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.homenumber = homenumber;
        this.email = email;
        this.company = company;
        this.title = title;
        this.group = group;
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

    public String getGroup() {
        return group;
    }
}
