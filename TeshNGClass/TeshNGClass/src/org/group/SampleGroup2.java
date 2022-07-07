package org.group;

import org.testng.annotations.Test;

public class SampleGroup2 {
	@Test(groups= {"reg","smoke"})
	public void regTest() {
		System.out.println("regTest class2");

	}
	@Test(groups= {"smoke"})
	public void smokeTest() {
		System.out.println("smokeTest class2");

	}
	@Test(groups= {"reg"})
	public void regTest2() {
		System.out.println("regTest2 class2");

	}
	@Test(groups= {"sanity"})
	public void sanityTest() {
		System.out.println("sanityTest class2");

	}
	@Test(groups= {"sanity"})
	public void sanityTest1() {
		System.out.println("sanityTest1 class2");

	}
	@Test(groups= {"smoke"})
	public void smokeTest1() {
		System.out.println("smokeTest1 class2");

	}

}
