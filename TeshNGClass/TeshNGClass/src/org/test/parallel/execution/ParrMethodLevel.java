package org.test.parallel.execution;

import org.testng.annotations.Test;

public class ParrMethodLevel {
	@Test
	public void test1() {
		System.out.println("Method 1 : "+Thread.currentThread().getId());

	}
	@Test
	public void test2() {
		System.out.println("Method 2 : "+Thread.currentThread().getId());

	}
	@Test
	public void test3() {
		System.out.println("Method 3 : "+Thread.currentThread().getId());

	}
	@Test
	public void test4() {
		System.out.println("Method 4 : "+Thread.currentThread().getId());

	}
	@Test
	public void test5() {
		System.out.println("Method 5 : "+Thread.currentThread().getId());

	}
	@Test
	public void test6() {
		System.out.println("Method 6 : "+Thread.currentThread().getId());

	}
	@Test
	public void test7() {
		System.out.println("Method 7 : "+Thread.currentThread().getId());

	}

}

