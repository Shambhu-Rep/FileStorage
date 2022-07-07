package org.test.retry;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Company2 {

	@Test
	public void test11() {
		Assert.assertTrue(true);
	}

	@Test
	public void test21() {
		Assert.assertTrue(true);
	}

	@Test
	public void test31() {
		Assert.assertTrue(false, "Verify check com2");
	}

	@Test
	public void test41() {
		Assert.assertTrue(true);
	}

}
