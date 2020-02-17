package com.Bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserValidationTest {

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateFirstName("Pranav");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenFirstName_WhenAllLowerCaseProper_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateFirstName("pranav");
        Assert.assertEquals(false, result);

    }

    @Test
    public void givenFirstName_WhenDigitOccurs_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateFirstName("pranav805");
        Assert.assertEquals(false, result);

    }

    @Test
    public void givenFirstName_WhenAllUpperCase_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateFirstName("PRANAV");
        Assert.assertEquals(false, result);

    }
}
