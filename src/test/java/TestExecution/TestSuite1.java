package TestExecution;

import Testutils.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import Pages.*;

public class TestSuite1 {
	public static Properties testprop;
	public static WebDriver driver=null;
	public static WebDriverWait sync;
	
  @Test
  public void f() {
	  HomePage.Verify_logo(driver, sync);
	  HomePage.Verify_PresenceOfHeaderCategories(driver, sync);
	  HomePage.verify_AboutUS(driver, sync);
	  
  }
  @BeforeTest
  public void beforeTest() throws IOException {
	  LoadTestProperties.loadTestDataProperties();
	  testprop=LoadTestProperties.getTestDataProperties();
	  if(testprop.getProperty("browser").equals("firefox"))
	  {
		  driver=new FirefoxDriver();
	  }
	  
	  else if(testprop.getProperty("browser").equals("chrome"))
	  {
		  driver=new ChromeDriver();
	  }
	  else
	  {
		  driver=new InternetExplorerDriver();
	  }
	  
	  
	  driver.get(testprop.getProperty("url"));
	  driver.manage().window().maximize();
	  sync=new WebDriverWait(driver, 30);
	  
	   
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
