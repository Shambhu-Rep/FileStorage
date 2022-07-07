package org.retry;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleGroup {
	@Test(retryAnalyzer=RetryFailed.class)
public void test1() {
		System.out.println("Method 1 is " + Thread.currentThread().getId());
		Assert.assertTrue(false);
	}

	@Test
public void test2() {
		System.out.println("Method 2 is " + Thread.currentThread().getId());
		Assert.assertTrue(false);

	}

	@Test
public void test3() {
		System.out.println("Method 3 is " + Thread.currentThread().getId());

	}

	@Test
public void test4() {
		System.out.println("Method 4 is " + Thread.currentThread().getId());

	}

	@Test
public void test5() {
		System.out.println("Method 5 is " + Thread.currentThread().getId());

	}

}
