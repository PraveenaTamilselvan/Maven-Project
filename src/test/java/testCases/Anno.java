package testCases;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;
import org.testng.annotations.Test;

public class Anno implements IAnnotationTransformer {
	@Override
	@Test
	public void transform(ITestAnnotation annotaion, Class testclass, Constructor testConst, Method testMethod) {

		annotaion.setRetryAnalyzer(testCases.RetryAna.class);

	}
}
