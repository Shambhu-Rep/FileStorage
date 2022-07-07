package org.testng.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataSample {
	@DataProvider(name="res",parallel=true)
	public Object[][] data() {
		return new Object[][] {{"shambhu","java","hii"},{"viki","sql","hello"}};
	}
	@Test(dataProvider="res")
	public void test(String s1,String s2,String s3) {
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}

}
