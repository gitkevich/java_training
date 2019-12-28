package by.vlad.addressbook.model;

public class ContactData {
    private int id;
    private final String firstname;
    private final String lastname;
    private final String homenumber;
    private final String email;
    private final String company;
    private final String title;

    public ContactData(int id, String firstname, String lastname, String homenumber, String email, String company, String title, String group) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.homenumber = homenumber;
        this.email = email;
        this.company = company;
        this.title = title;
        this.group = group;
    }

    public ContactData(String firstname, String lastname, String homenumber, String email, String company, String title, String group) {
        this.id = Integer.MAX_VALUE;
        this.firstname = firstname;
        this.lastname = lastname;
        this.homenumber = homenumber;
        this.email = email;
        this.company = company;
        this.title = title;
        this.group = group;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContactData that = (ContactData) o;

        if (firstname != null ? !firstname.equals(that.firstname) : that.firstname != null) return false;
        return lastname != null ? lastname.equals(that.lastname) : that.lastname == null;
    }

    @Override
    public int hashCode() {
        int result = firstname != null ? firstname.hashCode() : 0;
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        return result;
    }



    @Override
    public String toString() {
        return "ContactData{" +
                "id='" + id + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    private String group;

    public int getId() {
        return id;
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
