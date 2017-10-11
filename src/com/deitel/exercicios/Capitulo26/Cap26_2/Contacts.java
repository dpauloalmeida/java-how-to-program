package Capitulo26.Cap26_2;

public class Contacts {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

    public Contacts(String firstName, String lastName, String email, String phoneNumber) {
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
        setPhoneNumber(phoneNumber);
    }

    @Override
    public String toString() {
        return String.format("%s %s", getFirstName(), getLastName());
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (!firstName.matches("[A-Z][a-zA-Z]+")) {
            throw new IllegalArgumentException("First name invalid.");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (!lastName.matches("[A-Z][a-zA-Z]+")) {
            throw new IllegalArgumentException("Last name invalid.");
        }
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (!email.matches("[a-z]+[0-9]*[._]*[a-z0-9]*@[a-z]+\\.com||[a-z]+[0-9]*[._]*[a-z0-9]*@[a-z]+\\.com\\.br")) {
            throw new IllegalArgumentException("Email invalid.");
        }
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (!phoneNumber.matches("[1-9]{2}(-||\\s)9[0-9]{4}-[0-9]{4}||[1-9]{2}(-||\\s)[0-9]{4}-[0-9]{4}")) {
            throw new IllegalArgumentException("Phone number invalid.");
        }
        this.phoneNumber = phoneNumber;
    }
}
