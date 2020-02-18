package com.Bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserValidationTest {
    UserValidator userValidator = new UserValidator();

    //    Test cases for First Name
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        boolean result = userValidator.validateFirstName("Pranav");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenFirstName_WhenAllLowerCaseProper_ShouldReturnFalse() {
        boolean result = userValidator.validateFirstName("pranav");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenFirstName_WhenDigitOccurs_ShouldReturnFalse() {
        boolean result = userValidator.validateFirstName("pranav805");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenFirstName_WhenAllUpperCase_ShouldReturnFalse() {
        boolean result = userValidator.validateFirstName("PRANAV");
        Assert.assertEquals(false, result);
    }

//    Test cases for Last Name
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        boolean result = userValidator.validateLastName("Ige");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenLastName_WhenAllLowerCaseProper_ShouldReturnFalse() {
        boolean result = userValidator.validateLastName("ige");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenLastName_WhenAllUpperCase_ShouldReturnFalse() {
        boolean result = userValidator.validateLastName("IGE");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenLastName_WhenDigitOccurs_ShouldReturnFalse() {
        boolean result = userValidator.validateLastName("Ige8054");
        Assert.assertEquals(false, result);
    }

    //    Test cases for EMail
    @Test
    public void givenEMail_WhenProper_ShouldReturnTrue() {
        boolean result = userValidator.validateEMail("pranav.ige96@gmail.co.in");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenEMail_WhenSpacesOccur_ShouldReturnFalse() {
        boolean result = userValidator.validateEMail("pranav ige96@gmail.com");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenEMail_WhenAtSymbolIsMissing_ShouldReturnFalse() {
        boolean result = userValidator.validateEMail("pranav.ige96gmail.com");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenEMail_WhenDigitsOccurInFirstPart_ShouldReturnFalse() {
        boolean result = userValidator.validateEMail("pranav805.ige96@gmail.com");
        Assert.assertEquals(false, result);
    }

    //    Test cases for Mobile number
    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue() {
        boolean result = userValidator.validateMobileNumber("356 9167249096");
        Assert.assertEquals(true, result);
    }
    
    @Test
    public void givenMobileNumber_WhenNoSpace_ShouldReturnFalse() {
        boolean result = userValidator.validateMobileNumber("3569167249096");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenMobileNumber_WhenNoCountryCode_ShouldReturnFalse() {
        boolean result = userValidator.validateMobileNumber("9167249096");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenMobileNumber_WhenNumberOfDigitsIsNotTen_ShouldReturnFalse() {
        boolean result = userValidator.validateMobileNumber("356 916724909685");
        Assert.assertEquals(false, result);
    }

    //    Test cases for Password (Rule 1)
    @Test
    public void givenPasswordRule1_WhenProper_ShouldReturnTrue() {
        boolean result = userValidator.validatePasswordRule1("pranavige");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenPassword_WhenCharactersAreLessThanEight_ShouldReturnFrue() {
        boolean result = userValidator.validatePasswordRule1("pra");
        Assert.assertEquals(false, result);
    }

    //    Test cases for Password (Rule 2)
    @Test
    public void givenPasswordRule2_WhenProper_ShouldReturnTrue() {
        boolean result = userValidator.validatePasswordRule2("pranavIge");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenPasswordRule2_WhenNoUpperCaseLetter_ShouldReturnFalse() {
        boolean result = userValidator.validatePasswordRule2("pranavige");
        Assert.assertEquals(false, result);
    }
}
