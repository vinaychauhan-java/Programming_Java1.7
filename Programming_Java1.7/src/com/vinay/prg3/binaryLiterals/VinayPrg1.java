package com.vinay.prg3.binaryLiterals;

public class VinayPrg1 {

	/**
	 * With JDK 1.7, the integer whole numbers like byte, short, int and long
	 * can be expressed in binary format also with a prefix of 0b or 0B.
	 * Earlier, we have 0 prefix for octal and 0x prefix for hexa and no prefix
	 * for binary. 
	 * 
	 * Now, JDK 1.7, introduced 0b to represent binary literals :-)
	 * 
	 */
	public static void main(String... args) {

		int value1 = 0b101;

		System.out.printf("Chocolate costs Rs. %d", value1);
	}
}
