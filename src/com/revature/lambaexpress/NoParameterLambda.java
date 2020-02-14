package com.revature.lambaexpress;

public class NoParameterLambda {

	public static void main(String[] args) {
		
		/*
		 * SaySomething saySomething;
		 * 
		 * saySomething = new SaySomething("hey") { public String say() { return
		 * "HI without LAMBDA"; } };
		 * 
		 * System.out.println(saySomething.say());
		 */
		
		
		
		SaySomething s=(name, lastName)->{
			String k ="yong";
			return "hello with lambda expression"+k+name;};		
			System.out.println(s.sayFullName("nameYong", "Liang"));

	}

}
