package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest_3 {
	
	// directory where output is to be printed
	ExtentSparkReporter spark = new ExtentSparkReporter("testingreports.html");
	ExtentReports extent = new ExtentReports();
	static ExtentTest test;
	WebDriver driver = new EdgeDriver();
	
  @BeforeMethod
  public void tc_1() {
	  extent.attachReporter(spark);
	  spark.config().setDocumentTitle("mytest reports");
	  spark.config().setTheme(Theme.DARK);
	  WebDriverManager.edgedriver().setup();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().window().maximize();
  }
  
  @Test
  public void tc_2() throws InterruptedException {
	  test = extent.createTest("tc_2","to check the login of the page");
	  test.log(Status.PASS,"TC_001");
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123",Keys.ENTER);
	  Thread.sleep(5000);
	  String url = driver.getCurrentUrl();
	  Assert.assertEquals(url,"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
	  
  }
    
  @AfterSuite
  public void tc_3() {
	  extent.flush();
	  driver.quit();
  }
}
