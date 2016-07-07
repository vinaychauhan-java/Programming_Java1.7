package com.vinay.prg2.numericLiterals;

public class VinayPrg1 {

	/**
	 * Underscores are permitted in numeric literals. We can place underscores
	 * where we feel required to increase readability; like between Hundreds,
	 * Thousands and Lakhs etc.
	 * 
	 * This is used to group numbers in a bigger literal value (especially of
	 * long data type).
	 * 
	 * Note: Do not place underscore at the beginning or ending of the literal
	 * value.
	 * 
	 */
	public static void main(String... args) {

		int singleItemCost = 48_87_653;

		float completeProdutCost = 6_47_812.25_67f;

		System.out.println("Flat cost Rs. " + singleItemCost);

		System.out.println("Building cost Rs. " + completeProdutCost);
	}

}
