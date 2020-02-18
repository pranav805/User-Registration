package com.Bridgelabz;

public class UserValidator {

    public static void main(String[] args) {
        System.out.println("WELCOME TO USER REGISTRATION PROBLEM");
    }
    private static final String NAME_PATTERN="^[A-Z]{1}[a-z]{2,}$";

    public boolean validateFirstName(String fName){
        return fName.matches(NAME_PATTERN);
    }

    public boolean validateLastName(String LName) {
        return LName.matches(NAME_PATTERN);
    }
}
