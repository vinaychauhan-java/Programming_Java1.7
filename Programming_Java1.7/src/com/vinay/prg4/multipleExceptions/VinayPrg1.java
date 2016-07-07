package com.vinay.prg4.multipleExceptions;

public class VinayPrg1 {

	// Now in a single catch statement, multiple exceptions can be included
	// separated by pipe ( | ) symbol.
	public static void main(String... args) {
		int value = 0;
		int anIntArray[] = { 100, 200, 300, 400, 500 };
		try {
			int result = anIntArray[3] / value;
			System.out.println("Result :: " + result);
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException exception) {
			System.out.println(exception);
		}
	}

	/*
	 * Before Java 1.7, Code is written as :-
	 * 
	public static void main(String... args) {
		int value = 0;
		int anIntArray[] = { 100, 200, 300, 400, 500 };
		try {
			int result = anIntArray[3] / value;
			System.out.println("Result :: " + result);
		} catch (ArithmeticException exception) {
			System.out.println(exception);
		} catch (ArrayIndexOutOfBoundsException enxception) {
			System.out.println(enxception);
		}
	}
	*/

}
