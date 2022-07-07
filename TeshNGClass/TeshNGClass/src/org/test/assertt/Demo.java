package org.test.assertt;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo {
	@Parameters({"Username","Password"})
	@Test
	public void test1(String s1,String s2) {
		System.out.println(s1);
		System.out.println(s2);

	}

}

