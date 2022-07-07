package org.test.assertt;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethods {
	@Test
	public void test1() {
		System.out.println("test1");
		Assert.assertTrue(true);
		
	}
	@Test
	public void test111() {
		System.out.println("test111");
		Assert.assertTrue(true);
	}
	@Test
	public void test11() {
		System.out.println("test11");
		Assert.assertTrue(false);
		
	}
	@Test(dependsOnMethods="test111")
	private void test2() {
		System.out.println("test2");

	}
	

}
