package org.test.parallel.execution;

import org.testng.annotations.Test;
import org.testng.dataprovider.InvocationCount;

public class Sample2 {
	@Test(invocationCount=5)
	public void test1() {
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	public void test2() {
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	public void test3() {
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	public void test4() {
		System.out.println(Thread.currentThread().getId());
	}
}
