package com.cg.day1;

public class VariableDemo {
	
	
	int instanceVar = 50;
	
	
	static String staticVar="Shared Across Instances";
 
	public static void main(String[] args) {
		
		int localvar=10;
		
		System.out.println("Local variables:"+localvar); //10
		
		VariableDemo demo1 = new VariableDemo();
		VariableDemo demo2 = new VariableDemo();
		
		System.out.println("Instance Variables(demo1)"+ demo1.instanceVar); //50
		System.out.println("Instance Variables(demo2)"+ demo2.instanceVar); //50
		
		
		demo1.instanceVar=100;
		System.out.println("Modified Instance Variable(demo1)"+ demo1.instanceVar); //100
		System.out.println("Instance Variable (demo2 unchanged):"+demo2.instanceVar);// 50
		
		System.out.println("Static Variables:"+ staticVar); // Shared Accross instance
		
		staticVar = " Modified Static Variables";
		System.out.println("Modified Static Variable:"+staticVar);// Modified static var
		
		System.out.println("Static variable :"+demo2.staticVar); // Shared Across Var
		
		
		
		
		
 
	}
 
}
