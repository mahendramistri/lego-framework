package com.udemy.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OprnBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","D:\\GeckoDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		// Launch the Online Store Website
		driver.get("http://www.store.demoqa.com");

		// Print a Log In message to the screen
		System.out.println("Successfully opened the website www.Store.Demoqa.com");

		// Wait for 5 Sec
		Thread.sleep(5000);

		// Close the driver
		driver.quit();
	}

}
