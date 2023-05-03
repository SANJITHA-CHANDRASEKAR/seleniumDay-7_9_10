package com.example.dayone.testing2;

import org.testng.annotations.Test;

public class SampleGroups {
  @Test(groups= {"smoke"})
  public void TC_001() {
	  System.out.println("Smoke test:TC_001");
  }
  @Test(groups= {"Regression"})
  public void TC_002() {
	  System.out.println("Reg test:TC_002");
  }
  @Test(groups= {"Regression"})
  public void TC_003() {
	  System.out.println("Reg test:TC_003");
  }
}
