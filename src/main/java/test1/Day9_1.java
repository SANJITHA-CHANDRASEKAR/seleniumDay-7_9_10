package test1;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class Day9_1 {
	
  @Test(dataProvider = "d1")
  public void add(int n1, int n2, int exp) {
	  System.out.println(n1 + n2);
	  System.out.println(exp);
	  Assert.assertEquals(n1+n2, exp);
  }
  @DataProvider
  public Object[][] d1() {
    return new Object[][] {
      new Object[] { 1, 6, 7 },
      new Object[] { 2, 3, 5 }
    };
  }
  
  @Test(dataProvider = "d2")
  public void sub(int n1, int n2, int exp) {
	  System.out.println(n1 - n2);
	  System.out.println(exp);
	  Assert.assertEquals(n1 - n2, exp);
  }
  @DataProvider
  public Object[][] d2() {
    return new Object[][] {
      new Object[] { 6, 1, 5 },
      new Object[] { 2, 3, -1 }
    };
  }
  
  @Test(dataProvider = "d3")
  public void mul(int n1, int n2, int exp) {
	  System.out.println(n1 * n2);
	  System.out.println(exp);
	  Assert.assertEquals(n1 * n2, exp);
  }
  @DataProvider
  public Object[][] d3() {
    return new Object[][] {
      new Object[] { 6, 1, 6 },
      new Object[] { 2, 5, 10}
    };
  }
  
  @Test(dataProvider = "d4")
  public void div(int n1, int n2, int exp) {
	  System.out.println(n1 / n2);
	  System.out.println(exp);
	  Assert.assertEquals(n1 / n2, exp);
  }
  @DataProvider
  public Object[][] d4() {
    return new Object[][] {
      new Object[] { 6, 2, 3 },
      new Object[] { 10, 5, 2 }
    };
  }
}
