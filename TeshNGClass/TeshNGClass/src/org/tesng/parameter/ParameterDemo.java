package org.tesng.parameter;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterDemo {
	@Parameters({"username","Password"})
	@Test
	public void test1(@Optional("Vel")String name,String password) {
		System.out.println("The user name is :"+name);
		System.out.println("The password is :"+password);
		

	}
	@Test@Parameters({"Username","Password"})
	public void test2(String name,String pass) {
		System.out.println("Test with normal normal");
		System.out.println("The user name is :"+name);
		System.out.println("The password is :"+pass);
		

	}

}
