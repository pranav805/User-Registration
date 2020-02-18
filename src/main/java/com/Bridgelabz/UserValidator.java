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
}
