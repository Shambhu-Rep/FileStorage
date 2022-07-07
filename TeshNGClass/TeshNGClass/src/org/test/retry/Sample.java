package org.test.retry;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample {
	@Test
	public void test1() {
		Assert.assertTrue(true);
	}

	@Test
	public void test2() {
		Assert.assertTrue(true);
	}

	@Test
	public void test3() {
		Assert.assertTrue(false, "Verify check");
	}

	@Test
	public void test4() {
		Assert.assertTrue(true);
	}

}
