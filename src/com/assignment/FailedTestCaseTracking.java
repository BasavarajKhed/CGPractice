package com.assignment;

import java.util.HashMap;
import java.util.Map;

public class FailedTestCaseTracking {
    public static void main(String[] args) {
        
    	
    	
        Map<String, String> failedTestCases = new HashMap<>();

        
        failedTestCases.put("LoginTest", "NullPointerException");
        failedTestCases.put("PaymentTest", "Timeout Error");
        

       
        System.out.println("Failed Test Cases and Error Messages:");
        
        for (Map.Entry<String, String> entry : failedTestCases.entrySet()) {
            System.out.println("Test Case: " + entry.getKey() + " | Error: " + entry.getValue());
        }
    }
}

