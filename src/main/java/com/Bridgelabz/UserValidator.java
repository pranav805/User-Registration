package com.Bridgelabz;

public class UserValidator {

    public static void main(String[] args) {
        System.out.println("WELCOME TO USER REGISTRATION PROBLEM");
    }

//    Pattern for First name and Last name
    private final String NAME_PATTERN="^[A-Z]{1}[a-z]{2,}$";

//    Pattern for EMail address
    private final String EMAIL_PATTERN="^[A-Za-z]{3,}" +
                                        "([.|+|_|-]?" +
                                        "[A-Za-z0-9]+)?" +
                                        "[@]" +
                                        "[A-Za-z0-9]+" +
                                        "[.][A-Za-z]{2,4}" +
                                        "([.][A-Za-z]{2,4}+)?$";

//    Pattern for Mobile number
    private final String MOBILE_PATTERN="^[0-9]{3}" +
                                        "[ ]{1}" +
                                        "[0-9]{10}$";

//    Pattern for Password Rule 1: Minimum 8 chracters
    private final String PASSWORD_PATTERN_RULE1="^[a-z]{8,}$";

//    Pattern for Password Rule 2: At least 1 upper case
    private final String PASSWORD_PATTERN_RULE2="^(?=.*[A-Z]).[A-Za-z]{7,}$";

//    Pattern for Password Rule 3: At least 1 numeric number
private final String PASSWORD_PATTERN_RULE3="^(?=.*[A-Z])(?=.*[0-9])[A-Za-z0-9]{8,}$";

//  Pattern for Password Rule 4: Exactly one special character
 private final String PASSWORD_PATTERN_RULE4= "((?=.*[@#$%!])(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,})";


    public boolean validateFirstName(String fName){
        return fName.matches(NAME_PATTERN);
    }

    public boolean validateLastName(String LName) {
        return LName.matches(NAME_PATTERN);
    }

    public boolean validateEMail(String EMail) {
        return EMail.matches(EMAIL_PATTERN);
    }

    public boolean validateMobileNumber(String mobileNumber) {
        return mobileNumber.matches(MOBILE_PATTERN);
    }

    public boolean validatePasswordRule1(String password1) {
        return password1.matches(PASSWORD_PATTERN_RULE1);
    }

    public boolean validatePasswordRule2(String password2) {
        return password2.matches(PASSWORD_PATTERN_RULE2);
    }

    public boolean validatePasswordRule3(String password3) {
        return password3.matches(PASSWORD_PATTERN_RULE3);
    }

    public boolean validatePasswordRule4(String password4) {
        return password4.matches(PASSWORD_PATTERN_RULE4);
    }
}
