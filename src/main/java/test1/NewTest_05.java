package test1;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class NewTest_05 {
  @Test(groups="smoke test")
  public void tc_1() throws InterruptedException {
	
	  WebDriverManager.edgedriver().setup();
	  WebDriver driver = new EdgeDriver();
	  driver.get("https://www.godaddy.com/");
	  driver.manage().window().maximize();
	  String title = driver.getTitle();
	  Assert.assertEquals(title, "Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN");
	  Thread.sleep(5000);
	  System.out.println("Smoke test");
	  driver.quit();
  }
  @Test(groups="smoke test")
  public void tc_2() throws InterruptedException {
	  
	  WebDriverManager.edgedriver().setup();
	  WebDriver drive = new EdgeDriver();
	  drive.get("https://www.godaddy.com/");
	  drive.manage().window().maximize();
	  Thread.sleep(3000);
	  drive.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]")).click();
	  Thread.sleep(3000);
	  drive.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]")).click();
	  Thread.sleep(3000);
	  drive.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/div/div[2]/div[1]/ul/li[2]/a")).click();
	  Thread.sleep(3000);
	  System.out.println("Regression test one");
	  Assert.assertEquals(drive.getTitle(), "GoDaddy Domain Search - Buy and Register Available Domain Names");
	  drive.quit();
	  
  }
  
  @Test(groups="reg test")
  public void tc_3() throws InterruptedException {
	  WebDriverManager.edgedriver().setup();
	  WebDriver drive = new EdgeDriver();
	  drive.get("https://www.godaddy.com/");
	  drive.manage().window().maximize();
	  Thread.sleep(3000);
	  drive.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]")).click();
	  Thread.sleep(3000);
	  drive.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]")).click();
	  Thread.sleep(3000);
	  drive.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/div/div[2]/div[1]/ul/li[2]/a")).click();
	  Thread.sleep(3000);
	  System.out.println("Regression test one");
	  Assert.assertEquals(drive.getTitle(), "GoDaddy Domain Search - Buy and Register Available Domain Names");
	  drive.findElement(By.xpath("//*[@id=\"8469f0c3-e08f-4343-9756-ce0390b0d581\"]")).sendKeys(".com");
	  drive.findElement(By.xpath("//*[@id=\"id-1467954b-c5e3-4b0c-9046-9fc94d8ca892\"]/section/div/div/section/div/div[1]/div/div/div[2]/button")).click();
	  
	  System.out.println("Regression test two");
  }
  

}
