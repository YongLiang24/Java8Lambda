package com.revature.lambaexpress;

public class MultipleParameterLambda {
	public static void main(String[] args) {
		  SaySomething saySomething=(fName, lastName) -> { return  "Hello, "+fName+" "+lastName; };
		  System.out.println(saySomething.sayFullName("Jasdhir","Singh"));
		  SaySomething saySomething1=(String firstName, String lName) -> { return  "Hello, "+firstName+" "+lName; };
		  System.out.println(saySomething1.sayFullName("Rohit","Kumar"));
  }
}
