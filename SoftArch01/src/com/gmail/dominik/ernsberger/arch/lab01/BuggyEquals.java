/**
 * 
 */
package com.gmail.dominik.ernsberger.arch.lab01;

/**
 * Hochschule München FK07, Praktikum Softwarearchitektur, Aufgabe 01.
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
	private static X x = new X(2);
	/**
	 * Object of unknown Class X as static type Object.
	 */
	private static Object xObject = new X(2);
	/**
	 * Object of unknown and extended Class Y from Class X.
	 */
	private static Y y = new Y(2, 3);
	/**
	 * Object of unknown and extended Class Y from Class X.
	 */
	private static Y y1 = new Y(3, 3);
	
	/**
	 * Starts the program and calls the testing-methods.
	 * @param args nothing
	 */
	public static void main(String... args){
		System.out.println("Broken Typecheck: "+equalsHasBrokenTypecheck());
		System.out.println("Bad Signature: "+ equalsHasBadSignature());
		System.out.println("Misses super: "+ equalsMissesSuper());
	}
	
	/**
	 * Testing the unknown equal-method of John Cool for broken typecheck.
	 * 
	 * If the typecheck is wrong (instanceof) it will return true. Otherwise it will return false.
	 * instanceof accepts every extended class of X.
	 * @return true
	 */
	public static boolean equalsHasBrokenTypecheck(){
		return x.equals(y);
	}
	
	/**
	 * Testing the unknown equal-method of John Cool for bad signature.
	 * 
	 * Class X inhered an default equal-method with an Object parameter.
	 * The Compiler decided the default method, because xObject has as static type "Object".
	 * It doesn't call the method of John Cool.
	 * @return true
	 */
	public static boolean equalsHasBadSignature(){
		return !x.equals(xObject);
		
	}
	
	/**
	 * Testing the unknown equal-method of John Cool for missing super.
	 * 
	 * If the super-call is missing it doesn't call the equal-method of X to check the value of a.
	 * For this reason it appears equal even if the first parameter (a) is different.
	 * @return true
	 */
	public static boolean equalsMissesSuper(){
		return y.equals(y1);
	}

}
