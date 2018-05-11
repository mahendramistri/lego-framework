package com.udemy.logtest;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class LogManagerTest {
	
	static Logger mainLogger = LogManager.getLogger(LogManagerTest.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicConfigurator.configure();
		mainLogger.info("This is just a logger");

	}

}
