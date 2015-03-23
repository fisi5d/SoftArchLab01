/**
 * 
 */
package com.gmail.dominik.ernsberger.arch.lab01;

/**
 * @author Dominik
 *
 * 23.03.2015
 */
public class Y extends X{
	
	private int b;

	/**
	 * @param a
	 */
	public Y(int a, int b) {
		super(a);
		this.b = b;
		// TODO Auto-generated constructor stub
	}
	
	public boolean equals(Object anything) {
	    if(!(anything instanceof Y))  // falsch! Richtig waere: getClass() != anything.getClass()
	        return false;
	    if(!super.equals(anything))
	    	return false;
		return true;
	} 

}
