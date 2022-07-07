package org.testng.task;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PriorityClass {
	@Test
	public void test1() {
		System.out.println("test1");

	}
	@Test(retryAnalyzer=Execute.class)
	public void test2() {
		Assert.assertTrue(false);
		System.out.println("test2");

	}
	@Test
	public void test3() {
		System.out.println("test3");

	}
	@Test(priority=-7)
	public void test4() {
		System.out.println("test4");

	}
	@Test(priority=-2)
	public void test5() {
		System.out.println("test5");

	}
	@Test
	public void test6() {
		System.out.println("test6");
	}
	@Test
	public void test7() {
		System.out.println("test7");

	}
	@Test
	public void test8() {
		System.out.println("test8");

	}

}
