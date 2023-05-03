package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day9_2 {
	@Test
	  public void tc_1() throws InterruptedException {
		
		  WebDriverManager.edgedriver().setup();
		  WebDriver driver = new EdgeDriver();
		  driver.get("https://www.godaddy.com/");
		  driver.manage().window().maximize();
		  String title = driver.getTitle();
		  Assert.assertEquals(title, "Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN");
		  Thread.sleep(5000);
		  driver.quit();
	  }
	  @Test
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
	  
	  @Test
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
		  drive.quit();
		  
	  }
}
