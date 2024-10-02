package entity;

public class SignupStaff {
    
    // Fields for staff sign-up details
    private String staffEmail;
    private String password;

    // Constructor
    public SignupStaff(String staffEmail, String password) {

        this.staffEmail = staffEmail;
        this.password = password;
    }

    // Getter and Setter methods
    public String getStaffEmail() {
        return staffEmail;
    }

    public void setStaffEmail(String staffEmail) {
        this.staffEmail = staffEmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Method to display staff information
    public void displayStaffInfo() {
        System.out.println("Staff Email: " + staffEmail);
    }

    // Method to validate the password
    public boolean validatePassword() {
        // Password should be at least 8 characters long
        if (password.length() < 8) {
            System.out.println("Password must be at least 8 characters long.");
            return false;
        }

        // Password should contain at least one uppercase letter
        if (!password.matches(".*[A-Z].*")) {
            System.out.println("Password must contain at least one uppercase letter.");
            return false;
        }

        // Password should contain at least one lowercase letter
        if (!password.matches(".*[a-z].*")) {
            System.out.println("Password must contain at least one lowercase letter.");
            return false;
        }

        // Password should contain at least one digit
        if (!password.matches(".*[0-9].*")) {
            System.out.println("Password must contain at least one digit.");
            return false;
        }

        // Password should contain at least one special character
        if (!password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) {
            System.out.println("Password must contain at least one special character.");
            return false;
        }

        // Password is valid if all conditions are met
        return true;
    }
}
