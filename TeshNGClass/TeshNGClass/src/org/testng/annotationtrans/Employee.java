package org.testng.annotationtrans;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Employee {
	@Test
	public void test10() {
		Assert.assertTrue(true);

	}
	@Test
	public void test11() {
		Assert.assertTrue(false);
		System.out.println("test11");
	}
	@Test
	public void test13() {
		Assert.assertTrue(true);

	}
	@Test
	public void test14() {
		Assert.assertTrue(true);

	}

}
