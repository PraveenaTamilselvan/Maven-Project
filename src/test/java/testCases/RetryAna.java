package testCases;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class RetryAna implements IRetryAnalyzer {

	int count = 0;
	int retryCount = 3;

	@Override
	@Test
	public boolean retry(ITestResult results) {
		if (count < retryCount) {

			count++;
			return true;

		}

		return false;
	}
}