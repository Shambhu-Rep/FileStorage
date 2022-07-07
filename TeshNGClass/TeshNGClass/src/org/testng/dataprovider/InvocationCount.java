package org.testng.dataprovider;

import org.testng.annotations.Test;

public class InvocationCount {
	@Test(invocationCount=10,threadPoolSize=5)
	public void test2() {
		System.out.println(Thread.currentThread().getId());

	}

}
