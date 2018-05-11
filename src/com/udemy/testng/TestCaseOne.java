package com.udemy.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestCaseOne {
  @Test
  public void f() {
	  
	  System.out.println("This is test case");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("This block is before class");
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
