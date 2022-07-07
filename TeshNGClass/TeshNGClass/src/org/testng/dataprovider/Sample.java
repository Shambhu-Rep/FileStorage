package org.testng.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Sample {
	@DataProvider(name = "data",parallel=true)
	public Object[][] data() {
		return new Object[][] { { "Java", "Vel","hello","hello3"}};
	}

	@Test(dataProvider = "data" )
	private void test(String s1, String s2,String s3,String s4) {
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}

}
