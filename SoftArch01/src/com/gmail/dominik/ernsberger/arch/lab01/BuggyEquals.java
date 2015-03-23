/**
 * 
 */
package com.gmail.dominik.ernsberger.arch.lab01;

/**
 * Hochschule München FK07, Praktikum Softwarearchitektur, Aufgabe 01
 * 
 * @author Dominik Ernsberger, Andrea Kaminski
 * 
 * Java-Version: 1.8.0_31
 * Intel Core i5-3337U
 * 8GB RAM
 * Windows 8.1 64bit 
 *
 * 23.03.2015
 * 
 * @version 1.0
 */
public class BuggyEquals {
	
	/**
	 * Object of unknown Class X.
	 */
	static X x = new X(2);
	/**
	 * Object of unknown and extended Class Y from Class X.
	 */
	static Y y = new Y(2, 3);
	
	/**
	 * Starts the program and calls the testing-methods.
	 * @param args
	 */
	public static void main(String... args){
		System.out.println(equalsHasBrokenTypecheck());
	}
	
	/**
	 * Testing the unknown equal-method of John Cool for broken typecheck.
	 * 
	 * If the typecheck is wrong (instanceof) it will return true. Otherwise it will return false.
	 * @return
	 */
	public static boolean equalsHasBrokenTypecheck(){
		return x.equals(y);
	}

}
