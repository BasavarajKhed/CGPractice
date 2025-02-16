package com.day3;

import java.util.HashMap;
import java.util.Map;

public class NestedMapExample {
    public static void main(String[] args) {
        // Outer map: Department -> Inner map (Employee -> Salary)
        Map<String, Map<String, Integer>> Employee = new HashMap<>();
        
        // Creating inner maps for each department
        Map<String, Integer> testEmployee = new HashMap<>();
        testEmployee.put("John", 50000);
        testEmployee.put("Alice", 60000);

        Map<String, Integer> devEmployee = new HashMap<>();
        devEmployee.put("Bob", 80000);
        devEmployee.put("Charlie", 90000);

      
        Employee.put("HR", testEmployee);
        Employee.put("Engineering", devEmployee);

        
        System.out.println("Salary of John in QA: " + Employee.get("HR").get("John"));
        System.out.println("Salary of Bob in DEV: " + Employee.get("Engineering").get("Bob"));
        
        // Iterating over the nested map
        for (Map.Entry<String, Map<String, Integer>> entry : Employee.entrySet()) {
            System.out.println("QA: " + entry.getKey());
            Map<String, Integer> employees = entry.getValue();
            for (Map.Entry<String, Integer> employee : employees.entrySet()) {
                System.out.println("DeV: " + employee.getKey() + ", Salary: " + employee.getValue());
            }
        }
    }
}

