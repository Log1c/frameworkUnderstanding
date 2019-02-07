package ua.logic.InternetAdressExample;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EmailValidatorTest {
    @Test
    public void isEmailInvalidFalse() {
        assertFalse(new EmailValidator().isEmailInvalid("as@r"));
    }

    @Test
    public void isEmailInvalidTrue() {
        assertTrue(new EmailValidator().isEmailInvalid("as"));
    }

    @Test
    public void isEmailInvalidWithLastDotTrue() {
        assertTrue(new EmailValidator().isEmailInvalid("as@a."));
    }

    @Ignore
    @Test
    public void isEmailInvalidWithoutDotTrue() {
        assertTrue(new EmailValidator().isEmailInvalid("as@a"));
    }
}