package com.gmail.dominik.ernsberger.arch.lab01.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class BuggyEqualsTest {

	@Test
	public void test() {
//		assertTrue("Not a Broken Typecast", BuggyEquals.equalsHasBrokenTypecheck());
//		assertTrue("No bad signature", BuggyEquals.equalsHasBadSignature());
		assertTrue("No missing super", BuggyEquals.equalsMissesSuper());
	}

}
