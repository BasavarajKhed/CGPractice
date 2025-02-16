package com.assignment;

import java.util.TreeSet;

public class SortTestCaseNames {
    public static void main(String[] args) {
      
        TreeSet<String> testCaseNames = new TreeSet<>();

        
        testCaseNames.add("LoginTest");
        testCaseNames.add("SignupTest");
        testCaseNames.add("SearchTest");
        testCaseNames.add("AdvanceSearch");
        testCaseNames.add("LogoutTest");

      
        System.out.println("Sorted Test Case Names:");
        for (String testCase : testCaseNames) {
            System.out.println(testCase);
        }
    }
}





















