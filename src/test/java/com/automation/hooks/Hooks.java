package com.automation.hooks;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import static com.automation.utils.DriverUtils.getDriver;
import static com.automation.utils.DriverUtils.tearDown;

public class Hooks {

	@Before
	public void setUp() {
		getDriver();
	}

	@After
	public void teardown() {
		tearDown();
	}
}
