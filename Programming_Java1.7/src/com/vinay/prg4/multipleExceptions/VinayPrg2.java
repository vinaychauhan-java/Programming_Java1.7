package com.vinay.prg4.multipleExceptions;

public class VinayPrg2 {

	public static void main(String[] args) {

		try {
			int value = 10 / 0;
			System.out.println("Result :" + value);
		}
		/*
		 * Message during Compilation : The exception ArithmeticException is
		 * already caught by the alternative RuntimeException
		 */
		// catch (ArithmeticException | RuntimeException exception) {
		catch (ArithmeticException exception) {
			System.out.println(exception);
		}

	}

}
