package com.vinay.prg1.switchExpression;

public class VinayPrg1 {

	// Before JDK 7, only integral types can be used for switch-case statement.
	// Now, In JDK 7, we can use a String object as the selector.

	public static void main(String... args) {
		String day = "SAT";
		switch (day) {
		case "MON":
			System.out.println("Monday");
			break;
		case "TUE":
			System.out.println("Tuesday");
			break;
		case "WED":
			System.out.println("Wednesday");
			break;
		case "THU":
			System.out.println("Thursday");
			break;
		case "FRI":
			System.out.println("Friday");
			break;
		case "SAT":
			System.out.println("Saturday");
			break;
		case "SUN":
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invalid");
		}

	}

}
