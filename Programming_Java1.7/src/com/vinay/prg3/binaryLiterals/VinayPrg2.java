package com.vinay.prg3.binaryLiterals;

public class VinayPrg2 {

	public static void main(String... args) {
		// Some 32-bit 'int' literal values
		int intValue1 = 0b1111;
		int intValue2 = 0b1111_0001;

		// Formatted output:
		// "%d" for integer in decimal,
		// "%x" in hexadecimal,
		// "%o" in octal.
		// Note that "%b" prints true or false (for null), NOT binary.
		System.out.printf("%d(%x)(%o)(%b)\n", intValue1, intValue1, intValue1, intValue1);
		System.out.printf("%d(%x)(%o)(%b)\n", intValue2, intValue2, intValue2, intValue2);

		System.out.println("--------------------------------------------------------------");
		// An 8-bit 'byte' literal value. By default, literal values are 'int'.
		// Need to cast to 'byte'
		byte byteValue1 = (byte) 0b0110_1101;
		System.out.println(byteValue1);

		System.out.println("--------------------------------------------------------------");
		// A 16-bit 'short' literal value
		short shortValue1 = (short) 0b0111_0101_0000_0101;
		System.out.println(shortValue1);

		System.out.println("--------------------------------------------------------------");
		// A 64-bit 'long' literal value. Long literals requires suffix "L".
		long longValue1 = 0b1000_0101_0001_0110_1000_0101_0000_1010_0010_1101_0100_0101_1010_0001_0100_0101L;
		System.out.println(longValue1);

	}

}
