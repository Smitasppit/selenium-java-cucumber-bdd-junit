package com.automation.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static com.automation.utils.ConfigUtils.getPropertyByKey;

public class DriverUtils {

	static WebDriver driver;

	public DriverUtils() {

	}

	public static void initDriver() {
		String baseURL = getPropertyByKey("baseurl");
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseURL);
	}

	public static WebDriver getDriver() {
		if (driver == null) {
			initDriver();
		}
		return driver;
	}

	public static void tearDown() {
		driver.quit();
		driver = null;
	}
}
