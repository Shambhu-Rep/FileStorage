package org.testng.dataprovider;

import org.testng.annotations.Test;

public class Employee {
	@Test(dataProvider="data",dataProviderClass=DataPro.class)
	public void test1(String s1,String s2) {
		System.out.println(s1);
		System.out.println(s2);

	}

}
