package day20.encapsulation;

public class UserAccount {
    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String email;
    private String password;

    // Parameterized constructor
    public UserAccount(String firstName, String middleName, String lastName,
                       String address, String email, String password) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.address = address;

        // Call the setters so validation still runs
        this.setEmail(email);
        this.setPassword(password);
    }

    // Gett ers
    public String getFirstName() { return firstName; }
    public String getMiddleName() { return middleName; }
    public String getLastName() { return lastName; }
    public String getAddress() { return address; }
    public String getEmail() { return email; }
    public String getPassword() { return password; }

    // Sett ers
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setMiddleName(String middleName) { this.middleName = middleName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setAddress(String address) { this.address = address; }

    // Email validation
    public void setEmail(String email) {
        if (email != null && email.contains("@") && email.contains(".")) {
            this.email = email;
        } else {
            System.out.println("Invalid email format.");
        }
    }

    // Password validation
    public void setPassword(String password) {
        if (password != null && password.length() >= 8
                && password.matches(".*[A-Za-z].*")
                && password.matches(".*\\d.*")) {
            this.password = password;
        } else {
            System.out.println("Invalid password. Must be at least 8 characters with letters and numbers.");
        }
    }

    @Override
    public String toString() {
        return "Full Name: " + firstName + " " + middleName + " " + lastName + "\n"
                + "Email: " + email + "\n"
                + "Address: " + address;
    }
}
