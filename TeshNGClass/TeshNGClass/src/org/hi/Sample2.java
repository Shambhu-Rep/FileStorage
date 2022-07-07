package org.hi;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.base.Verify;

public class Sample2 {

	@Test
	public void test111() {
		// Verify.verify(false, "verify check");
		System.out.println(4156);
		Verify.verify(true, "verify check1");
	}

	@Test
	public void test1211() {
		Assert.assertTrue(true, "hi");
		System.out.println(26531);
	}
}
