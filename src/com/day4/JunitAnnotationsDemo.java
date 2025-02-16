package com.day4;
import java.util.logging.Logger;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
 
@DisplayName("Junit5 Annotation Demo")
 
public class JunitAnnotationsDemo {
 
//	1. @Test: Marks a method as a test case
//	2. @BeforeEach: Executes before each test method
//	3.@AfterEach: Executes after each test Method
//	4. @BeforeAll: Executes once before all the test methods in the calss( must be static)
//	5.@AfterAll : Executes once before all the test methods in the calss ( must be static)
//	6.@Disabled :Dispable a test case
//	7.@DisplayName: --Customize the test name
//	8.@Tag:Tags a test for selective execution
	
	private static final Logger logger = Logger.getLogger(JunitAnnotationsDemo.class.getName());
 
	@BeforeAll
	static void intiAll() {
		//System.out.println("Before All test");
		logger.info("Before All Test");
	}
 
	@BeforeEach
	void init() {
		//System.out.println("Before Each Test");
		logger.info("Before Each Test");
	}
 
	@Test
	@DisplayName("Simple test")
	void test1() {
		//System.out.println("Executing Test 1");
		logger.info("Executing Test 1");
	}
 
	@Test
	@DisplayName("Disabled Test")
	@Disabled
	void test2() {
		//System.out.println("Executing Test 2");
		logger.info("Executing Test 2");
	}
 
	@AfterEach
	void cleanUp() {
		//System.out.println(" After Each Test");
		logger.info(" After Each Test");
	}
 
	@AfterAll
	static void cleanUpAll() {
		//System.out.println("After All Test");
		logger.info("After All Test");
	}
 
}
 