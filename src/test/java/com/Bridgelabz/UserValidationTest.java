package com.Bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserValidationTest {

//    Test cases for First Name
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

//    Test cases for Last Name
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateLastName("Ige");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenLastName_WhenAllLowerCaseProper_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateLastName("ige");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenLastName_WhenAllUpperCase_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateLastName("IGE");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenLastName_WhenDigitOccurs_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateLastName("Ige8054");
        Assert.assertEquals(false, result);
    }
}
