/**
 * 
 */
package com.gmail.dominik.ernsberger.arch.lab01.test;

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
	}
	
	public boolean equals(Object anything) {
		if(anything == null)
			return false;
	    if(getClass() != anything.getClass())
	        return false;
	    if(!super.equals(anything))
	    	return false;
	    Y that = (Y)anything;
	    if(b != that.b)
	    	return false;
		return true;
	} 

}
