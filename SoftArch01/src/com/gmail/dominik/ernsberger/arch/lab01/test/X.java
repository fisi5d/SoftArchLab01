/**
 * 
 */
package com.gmail.dominik.ernsberger.arch.lab01.test;

/**
 * @author Dominik
 *
 *         23.03.2015
 */
public class X {

	private int a;

	public X(int a) {
		this.a = a;
	}

	public boolean equals(Object anything) {
//	public boolean equals(X anything){
		if (anything == null)
			return false;
		if (getClass() != anything.getClass())
//		if(!(anything instanceof X))
			return false;
		X that = (X) anything;
		if (a != that.a)
			return false;
		return true;
	}
}
