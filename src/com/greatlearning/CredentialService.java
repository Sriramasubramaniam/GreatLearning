package com.greatlearning;

import java.util.Random;

public class CredentialService {
    //credential variables to be stored in this class
    private String email = "";
    private String passwordString = "";

    //helper functions
    public void generatePassword(){
        String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String specialCharacters = "!@#$%^&*()_+=<>-?";

        String allowedCharacters = uppercaseLetters + lowercaseLetters + numbers + specialCharacters;

        Random random = new Random();

        // From our discussion in online class StringBuffer is thread safe but I searched a bit and found that StringBuilder is similar but faster as it is not thread safe.
        // Since we are not using multithreading here, I'm going with StringBuilder
        StringBuilder password = new StringBuilder();

        //ten letter password
        for (int i = 0; i < 10; i++) {
            int index = random.nextInt(allowedCharacters.length());
            password.append(allowedCharacters.charAt(index));
        }

        passwordString = password.toString();

    };
    public void generateEmailAddress(String firstName, String lastName, String department, String companyName){
        this.email = firstName.toLowerCase()+lastName.toLowerCase()+"@"+department.toLowerCase().replaceAll("\\s","")+"."+companyName+".com";
    }
    public void showCredentials(String firstName){
        System.out.println("Dear "+firstName+" your generated credentials are as follows:");
        System.out.println("Email -->"+ email);
        System.out.println("Password -->"+ passwordString);
    }
}
