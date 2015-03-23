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
/*
	public boolean equals(Object anything) {
	    if(!(anything instanceof X))  // falsch! Richtig waere: getClass() != anything.getClass()
	        return false;
		return true;
	}
	
	*/
	
	public boolean equals(Object anything) {  // falsch! Richtig waere: Object anything
	  if(getClass() != anything.getClass())
		  return false;
	  X that = (X) anything;
	  if(a != that.a)
		  return false;
	  return true;
	}
}
