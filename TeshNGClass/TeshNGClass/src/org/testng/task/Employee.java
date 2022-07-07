package org.testng.task;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Employee {
	@Test
	public void test10() {
		Assert.assertTrue(true);

	}
	@Test(retryAnalyzer=Execute.class)
	public void test11() {
		Assert.assertTrue(false);

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
