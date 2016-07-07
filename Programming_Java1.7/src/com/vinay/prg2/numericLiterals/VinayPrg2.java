package com.vinay.prg2.numericLiterals;

public class VinayPrg2 {

	public static void main(String... args) {
		String value = "20_24";

		int numberValue = Integer.parseInt(value);

		// Will Throw Exception : java.lang.NumberFormatException
		System.out.println(numberValue);
	}

}
