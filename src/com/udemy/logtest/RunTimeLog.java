package com.udemy.logtest;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class RunTimeLog {

	public static void main(String[] args) {
		 BasicConfigurator.configure();
	     Logger LoggerParent = LogManager.getLogger("LoggerParent_Warning");
		     try
		     {
		    	 // We will get a divide by zero exception her
		    	 int x = 200 / 0;
		     }
		     catch(Exception exp)
		     {
		       LoggerParent.warn("Following exception was raised", exp);	
		      		       
		     }     

	}

}
