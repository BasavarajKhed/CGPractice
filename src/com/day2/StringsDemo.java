package com.day2;

public class StringsDemo {

	public static void main(String[] args) {
		String userMessage = "Hello team, I have an issue  with my ORDER ID:12345. Please HELP!";
		System.out.println(userMessage.trim());
		System.out.println(userMessage.contains("ORDER ID"));
		System.out.println(userMessage.substring(37,50));
		
		System.out.println(userMessage.toLowerCase());
		System.out.println(userMessage.toUpperCase());
		System.out.println(userMessage.endsWith("!"));
		System.out.println(userMessage.startsWith("Hello"));
		
		
		
		
		
		
		
//		
//		   1. Trim
//		   2.check the messag contains "ORDER ID"
//		   3. extract the order id
//		   4.conver the msg into lower and upper case
//		  5. check the message ends with "!"
//		   6.Check if the message starts with " Hello"
		
		
		
	}

}
