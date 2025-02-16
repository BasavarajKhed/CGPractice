package com.assignment;


import java.util.HashMap;
import java.util.Map;

public class TestResultsComparison {
    public static void main(String[] args) {
        // Creating two maps to store expected and actual results
    	
    	
    	
        Map<String, String> expectedResults = new HashMap<>();
        Map<String, String> actualResults = new HashMap<>();

       
        expectedResults.put("TC001", "Pass");
        expectedResults.put("TC002", "Fail");
        expectedResults.put("TC003", "Pass");
        expectedResults.put("TC004", "Fail");

        
        actualResults.put("TC001", "Pass");
        actualResults.put("TC002", "Pass");  
        actualResults.put("TC003", "Fail");  

       
        System.out.println("Mismatched Test Results:");
        
        for (String testCaseID : expectedResults.keySet()) {
            String expectedResult = expectedResults.get(testCaseID);
            String actualResult = actualResults.get(testCaseID);

         
            if (expectedResult != null && !expectedResult.equals(actualResult)) {
                System.out.println("Test Case ID: " + testCaseID + " | Expected: " + expectedResult + " | Actual: " + actualResult);
            }
        }
    }
}


















