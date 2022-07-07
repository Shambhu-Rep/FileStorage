package org.testng.dataprovider;

import org.testng.annotations.DataProvider;

public class DataPro {
	@DataProvider(name="data",parallel=true)
	public static Object[][] dataProvider() {
		return new Object[][] {{"ganesh","sql"},{"Vel","plsql"}} ;
		

	}

}
