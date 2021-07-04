package com.automation.test.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/features/"},
		glue = {"com.automation.stepDefs", "com.automation.hooks"},
		tags = ("@HomePage"),
		plugin = {"pretty", "html:target/cucumber-report","json:target/cucumber.json"}, 
        dryRun = false
)
public class TestRunner {
	
	static long startTime;
	static long endTime;

	@BeforeClass
	public static void startRun() throws Exception {
		System.out.println(">>>>> STARTING TEST SUITE RUN<<<<<");
		startTime = System.currentTimeMillis();
		System.out.println("SUITE START: " + startTime);
	}

	@AfterClass
	public static void endRun() throws Exception {
		System.out.println(">>>>> FINISHED TEST SUITE RUN <<<<<");
		endTime = (System.currentTimeMillis() - startTime) / 1000;
		System.out.println("SUITE END: " + endTime);
	}
}
