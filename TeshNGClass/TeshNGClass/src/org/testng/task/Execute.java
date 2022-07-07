package org.testng.task;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Execute implements IRetryAnalyzer {
	int min=1,max=10;

	@Override
	public boolean retry(ITestResult arg0) {
		if(min<max) {
			min++;
			return true;
		}
		return false;
	}

}
