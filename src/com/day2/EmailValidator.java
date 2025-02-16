package com.day2;

import java.util.regex.*;

public class EmailValidator {

    // Regex pattern for a valid email
    public static String Email_Pattern = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

    // Method to validate email address using regex
    public static boolean isValidEmail(String email) {
        // Compile the regex pattern
        Pattern pattern = Pattern.compile(Email_Pattern );
        
        // Match the email string against the pattern
        Matcher matcher = pattern.matcher(email);
        
        // Return true if the email matches the pattern
        return matcher.matches();
    }

    public static void main(String[] args) {
        // Test email addresses
        String[] emails = {
            "valid.email@example.com",
            "invalid-email@com",       // Invalid email
            "another.valid@domain.org",
            "invalid@domain@com",      // Invalid email
            "user@domain.co.uk"
        };

        // Validate each email address
        for (String email : emails) {
            System.out.println("Email: " + email + " -> " + (isValidEmail(email) ? "Valid" : "Invalid"));
        }
    }
}

