package test1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest_2 {
	int a=20,b=5;
  @Test
  public void add() {
	  int c=a+b;
	  Assert.assertEquals(c, 25);
  }
  @Test
  public void sub() {
	  int c=a-b;
	  Assert.assertEquals(c, 15);
  }
  @Test
  public void mul() {
	  int c=a*b;
	  Assert.assertEquals(c, 100);
  }
  @Test
  public void div() {
	  int c=a/b;
	  Assert.assertEquals(c, 5);
  }
}
