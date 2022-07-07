package org.test.parallel.execution;

import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParaWithMethod {
	@Parameters({"Username","Password"})
	@Test(dependsOnMethods="test11")
	public void test22(String userName,String pass) {
		//Assert.assertTrue(false);
		System.out.println("The user name is : "+userName);
		System.out.println("The password is : "+pass);
		System.out.println(Thread.currentThread().getId());

	}
	@Parameters({"User","Pass"})
	@Test//(dependsOnMethods="test11")
	public void test33(@Optional("Shambhu")String uname,@Optional("4321")String password) {
		System.out.println("Test with normal method");
		System.out.println("User name "+uname);
		System.out.println("Password "+password);
		System.out.println(Thread.currentThread().getId());

	}
	@Test
	public void test11() {
		System.out.println("Pass");

	}

}
