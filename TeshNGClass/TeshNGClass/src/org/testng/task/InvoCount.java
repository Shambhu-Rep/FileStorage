package org.testng.task;

import org.testng.annotations.Test;

public class InvoCount {
	@Test(invocationCount = 5, threadPoolSize = 6)
	public void test1() {
		System.out.println(Thread.currentThread().getId());
	}

}
