package com.udemy.baseclass;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchingIE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String service = "D:\\IEDriver\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", service);
		InternetExplorerDriver  driver = new InternetExplorerDriver();

		driver.get("http://yahoo.com");
	}

}
