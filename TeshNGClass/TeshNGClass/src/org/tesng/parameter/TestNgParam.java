package org.tesng.parameter;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgParam {
	@Parameters({"Username","Password","EmailId"})
	@Test()
	public void test22(String s1,@Optional("pass")String s2,String s3) {
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
	@Test(dependsOnMethods="test22")
	private void test11() {
		System.out.println("test1");

	}

}
