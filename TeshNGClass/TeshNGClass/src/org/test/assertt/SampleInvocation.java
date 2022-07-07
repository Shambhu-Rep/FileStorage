package org.test.assertt;

import org.testng.annotations.Test;

public class SampleInvocation {
	@Test(invocationCount=5)
	public void test22() {
		System.out.println("Test with invocation");
	}
	@Test
	public void test33() {
		System.out.println("Test with normal methods");

	}

}

