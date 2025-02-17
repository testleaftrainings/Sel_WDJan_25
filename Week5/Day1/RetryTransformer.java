package week5.day1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;

public class RetryTransformer implements IAnnotationTransformer {
	
	
	public void transform(ITestAnnotation annotation, Class testclass,Constructor testConstructor,Method testMethod) {
		annotation.setRetryAnalyzer(week5.day1.RetryAnalyser.class);
	}
	
	
	
	
	

}
