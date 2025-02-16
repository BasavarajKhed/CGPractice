package com.assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestExecutionReport {
	public static void main(String[] args) {

		Map<String, List<String>> testExecutionResults = new HashMap<>();

		addTestResult(testExecutionResults, "TC001", "Pass");
		addTestResult(testExecutionResults, "TC002", "Fail");
		addTestResult(testExecutionResults, "TC003", "Pass");
		addTestResult(testExecutionResults, "TC004", "Skipped");
		addTestResult(testExecutionResults, "TC005", "Fail");
		addTestResult(testExecutionResults, "TC006", "Pass");
		addTestResult(testExecutionResults, "TC007", "Skipped");

		printTestExecutionReport(testExecutionResults);
	}

	public static void addTestResult(Map<String, List<String>> map, String testCaseID, String status) {

		map.putIfAbsent(status, new ArrayList<>());

		map.get(status).add(testCaseID);
	}

	public static void printTestExecutionReport(Map<String, List<String>> map) {
		System.out.println("Test Execution Report:");

		for (Map.Entry<String, List<String>> entry : map.entrySet()) {
			String status = entry.getKey();
			List<String> testCases = entry.getValue();

			System.out.println(status + ": " + testCases.size() + " test case(s)");
			for (String testCase : testCases) {
				System.out.println(" - " + testCase);
			}
			System.out.println(); 
		}
	}
}
