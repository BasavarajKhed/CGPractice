package com.day4;

import java.util.logging.Logger;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
 
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//@TestMethodOrder(MethodOrderer.MethodName.class)
@TestMethodOrder(MethodOrderer.Random.class)
public class OrderTestDemo {
	private static final Logger logger = Logger.getLogger(JunitAnnotationsDemo.class.getName());
 
	@Test
	@Order(1)
	public void OpenWebBrowser() {
		logger.info("Open Web Browser");
	}
 
	@Test
	@Order(2)
	public void OpenWebPage() {
		logger.info("OpenWebPage");
	}
 
	@Test
	@Order(3)
	public void SignUp() {
		logger.info("SignUp");
	}
 
	@Test
	@Order(4)
	public void Login() {
		logger.info("Login");
	}
 
	@Test
	@Order(5)
	public void SearchFligh() {
		logger.info("SearchFligh");
	}
 
	@Test
	@Order(6)
	public void SelectFlight() {
		logger.info("SelectFlight");
	}
 
	@Test
	@Order(7)
	public void bookFLight() {
		logger.info("bookFLight");
	}
 
	@Test
	@Order(8)
	public void proceedPayment() {
		logger.info("proceedPayment");
	}
 
	@Test
	@Order(9)
	public void LogOut() {
		logger.info("LogOut");
	}
 
}
 
