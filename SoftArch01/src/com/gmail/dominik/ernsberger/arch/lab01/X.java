/**
 * 
 */
package com.gmail.dominik.ernsberger.arch.lab01;

/**
 * @author Dominik
 *
 * 23.03.2015
 */
public class X {
	
	private int a;
	
	public X(int a){
		this.a = a;
	}

	public boolean equals(Object anything) {
	    if(!(anything instanceof X))  // falsch! Richtig waere: getClass() != anything.getClass()
	        return false;
		return true;
	}
}
