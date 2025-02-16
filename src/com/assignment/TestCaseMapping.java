package com.assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestCaseMapping {
    public static void main(String[] args) {
        
        Map<String, List<String>> testCases = new HashMap<>();

        
        List<String> loginTestSteps = new ArrayList<>();
        loginTestSteps.add("Navigate to login page");
        loginTestSteps.add("Enter username and password");
        loginTestSteps.add("Click login button");
        loginTestSteps.add("Verify login successful");

       

      
        testCases.put("LoginTest", loginTestSteps);
       

       
        for (Map.Entry<String, List<String>> entry : testCases.entrySet()) {
            String testCaseName = entry.getKey();
            List<String> steps = entry.getValue();

            System.out.println("Test Case: " + testCaseName);
            
            System.out.println("Test Steps:");
            
            for (String step : steps) {
                System.out.println("- " + step);
            }
            
            System.out.println();
        }
    }
}

