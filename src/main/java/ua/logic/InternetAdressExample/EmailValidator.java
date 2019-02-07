package ua.logic.InternetAdressExample;

import javax.mail.internet.InternetAddress;

public class EmailValidator {
     public boolean isEmailInvalid(String email) {
        try {
            InternetAddress internetAddress = new InternetAddress(email);
            internetAddress.validate();
        } catch (Exception e) {
            System.err.println(e);
            return true;
        }

        return false;
    }
}
