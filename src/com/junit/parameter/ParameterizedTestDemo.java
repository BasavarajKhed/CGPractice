package com.junit.parameter;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

public class ParameterizedTestDemo {
	
	
	@ParameterizedTest
	@ValueSource(strings= {"capgemini","benglaluru","pune"})
	void testWithValueSource(String name) {
    assertNotNull(name);
    System.out.println("Names "+name);

	}
	
	
	 @ParameterizedTest
	    @CsvFileSource(resources = "/test_data.csv", numLinesToSkip = 1)  // The CSV file is in the "resources" folder
	    public void testNameAge(String names, int age) {
	        System.out.println("Name: " + names + " = Age: " + age);
	        assertTrue(age > 19, "Age should be greater than 19");
	
	
}
}