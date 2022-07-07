package org.group;

import org.testng.annotations.Test;

public class SampleGroup {
	@Test(groups= {"reg"})
public void regTest() {
		System.out.println("regTest");

	}
	@Test(groups= {"smoke"})
public void smokeTest() {
		System.out.println("smokeTest");

	}
	@Test(groups= {"reg"})
public void regTest2() {
		System.out.println("regTest2");

	}
	@Test(groups= {"sanity"})
public void sanityTest() {
		System.out.println("sanityTest");

	}

}
