package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Day9_3 {
  WebDriver driver;
  @Parameters(value="browsers")
  @BeforeTest
  public void check(String browsers) {
	  if(browsers.equals("edge"))
	  {
		  WebDriverManager.edgedriver().setup();
		  driver = new EdgeDriver();
		  driver.manage().window().maximize();
	  }
	  else
	  {
		  WebDriverManager.chromedriver().setup();
		  ChromeOptions co=new ChromeOptions(); 
	      co.addArguments("--remote-allow-origins=*");
		  driver = new ChromeDriver(co);
		  driver.manage().window().maximize();
	  }
  }
  @Test
  public void tc01() throws InterruptedException{
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123",Keys.ENTER);
	  Thread.sleep(5000);
	  String url = driver.getCurrentUrl();
	  Assert.assertEquals(url,"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
  }
  @AfterTest
  public void after() {
	  driver.quit();
	  
  }
  
}
