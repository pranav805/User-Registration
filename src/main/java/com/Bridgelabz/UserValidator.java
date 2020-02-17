package com.Bridgelabz;

public class UserValidator {
    public boolean validateFirstName(String fName){
        return fName.matches("^[A-Z]{1}[a-z]{2,}$");
    }
    public static void main(String[] args) {
        System.out.println("WELCOME TO USER REGISTRATION PROBLEM");
    }
}
