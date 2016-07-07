package com.vinay.prg5.tryWithResource;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class VinayPrg1 {
	/**
	 * 
	 * With JDK 1.7, no finally block is required to close (using close()
	 * methods) the resources of files or sockets or JDBC handles (objects) etc.
	 * The resources (say Objects) opened in try block automatically close when
	 * the execution control passes out try block (for example, at the close
	 * brace of try block).
	 */
	
	public static void main(String[] args) {
		try (BufferedReader in = new BufferedReader(new FileReader(
				"D:\\_VinayWork\\MyTestWorkSpace-4\\Programming_Java1.7\\src\\com\\vinay\\prg5\\tryWithResource\\myInFile.txt"));
				BufferedWriter out = new BufferedWriter(new FileWriter(
						"D:\\_VinayWork\\MyTestWorkSpace-4\\Programming_Java1.7\\src\\com\\vinay\\prg5\\tryWithResource\\myOutFile.txt"))) {
			int charRead;
			while ((charRead = in.read()) != -1) {
				System.out.printf("%c", (char) charRead);
				out.write(charRead);
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	/**
	 * A new interface AutoCloseable is introduced with JDK 1.7 for this
	 * purpose.
	 * 
	 * public interface java.lang.AutoCloseable { public abstract void close()
	 * throws java.lang.Exception; }
	 * 
	 * Any resource (class) that implements interface "java.lang.AutoCloseable"
	 * is eligible as a resource statement to write in try block. From JDK 1.7,
	 * many classes implement AutoCloseable interface, like BufferedReader,
	 * PrintStream, Scanner, Socket etc.
	 * 
	 * The close() method of AutoCloseable is called implicitly to close the
	 * handles.
	 */
	
	/*
	 *  Before Java 1.7, Code is written as :-
	 *  
	public static void main(String[] args) {
		BufferedReader inFile = null;
		BufferedWriter outFile = null;
		try {
			inFile = new BufferedReader(new FileReader(
					"D:\\_VinayWork\\MyTestWorkSpace-4\\Programming_Java1.7\\src\\com\\vinay\\prg5\\tryWithResource\\myInFile.txt"));
			outFile = new BufferedWriter(new FileWriter(
					"D:\\_VinayWork\\MyTestWorkSpace-4\\Programming_Java1.7\\src\\com\\vinay\\prg5\\tryWithResource\\myOutFile.txt"));
			int charRead;
			while ((charRead = inFile.read()) != -1) {
				System.out.printf("%c", (char) charRead);
				outFile.write(charRead);
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (inFile != null)
					inFile.close();
				if (outFile != null)
					outFile.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
	*/

}
