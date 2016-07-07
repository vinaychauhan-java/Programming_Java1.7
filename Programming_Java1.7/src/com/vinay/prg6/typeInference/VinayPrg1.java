package com.vinay.prg6.typeInference;

import java.util.ArrayList;
import java.util.List;

public class VinayPrg1 {

	public static void main(String... args) {

		/*
		 * In JDK 1.7, empty angle brackets (known as Diamond operator), <>, can
		 * be used in specifying generic type instead of writing the exact one.
		 * But remember that compiler should be able to judge the type from the
		 * Generics statement we write.
		 */
		List<String> list2 = new ArrayList<>();
		list2.add("January");
		list2.add("February");
		for (String item : list2) {
			System.out.println(item);
		}

		System.out.println("--------------------------------------------------------------");

		// Before Java 1.7, Code is written as :-
		List<String> list1 = new ArrayList<String>();
		list1.add("January");
		list1.add("February");
		for (String item : list1) {
			System.out.println(item);
		}
	}

}
