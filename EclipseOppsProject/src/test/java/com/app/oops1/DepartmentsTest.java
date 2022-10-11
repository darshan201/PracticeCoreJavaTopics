package com.app.oops1;

import org.junit.Test;

import junit.framework.Assert;
import junit.framework.TestCase;

public class DepartmentsTest extends TestCase {
	@Test
	public final void testExpence() {
		Departments d1 = new Departments();

		assertEquals("Total expences : " + 300 + "$", d1.expence());

	}

}
