package org.retry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailed implements IRetryAnalyzer{
	private int retrycount=0;
	private int retrymaxcount=3;

	@Override
	public boolean retry(ITestResult arg0) {
		// TODO Auto-generated method stub
		if(retrycount<retrymaxcount) {
			retrycount++;
			return true;
		}
		return false;
	}

}
