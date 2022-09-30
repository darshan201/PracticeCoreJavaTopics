package com.app.oops1;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class ChildPatientTest {

	@Test
	public final void testDetailsIntString() {
		ChildPatient c1 = new ChildPatient();
		assertEquals("new patient number : " + 5 + ", new patient name :" + "darshan", c1.details(5, "darshan"));
		
	}

	@Test
	public final void testDetailsIntStringLong() {
		Patient p1 = new Patient();
		
		assertEquals(5 + "," + "darshan" + "," + "20l", p1.details(5, "darshan", 20l));
	}

}
