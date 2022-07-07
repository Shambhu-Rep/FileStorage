package org.test.retry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Execute implements IRetryAnalyzer {
int min=0,max=5;
	@Override
	public boolean retry(ITestResult arg0) {
		if(min<max) {
			min++;
			return true;
		}
		return false;
	}

}
